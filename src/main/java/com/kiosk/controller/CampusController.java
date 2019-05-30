package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.CampusDTO;
import com.kiosk.model.Campus;
import com.kiosk.service.base.CampusService;
import com.kiosk.transformer.CampusTransformer;
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
public class CampusController extends BaseController<CampusDTO, Campus> {

    @Autowired
    public CampusController(CampusTransformer transformer, CampusService service) {
        super(transformer, service);
    }

    @GetMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<CampusDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = CAMPUS_BASE_URL)
    @Override
    public ResponseEntity<Page<CampusDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = CAMPUS_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<CampusDTO> create(@Valid @RequestBody CampusDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<CampusDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody CampusDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
