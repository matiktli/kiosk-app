package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.TagDTO;
import com.kiosk.model.Tag;
import com.kiosk.service.base.TagService;
import com.kiosk.transformer.TagTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class TagController extends BaseController<TagDTO, Tag> {

    @Autowired
    public TagController(TagTransformer transformer, TagService service) {
        super(transformer, service);
    }

    @GetMapping(value = TAG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<TagDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = TAG_BASE_URL)
    @Override
    public ResponseEntity<Page<TagDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PostMapping(value = TAG_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<TagDTO> create(@Valid @RequestBody TagDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = TAG_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<TagDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody TagDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = TAG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
