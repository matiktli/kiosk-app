package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.UserPersonalizationDTO;
import com.kiosk.model.UserPersonalization;
import com.kiosk.service.base.UserPersonalizationService;
import com.kiosk.transformer.UserPersonalizationTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserPersonalizationController extends BaseController<UserPersonalizationDTO, UserPersonalization> {

    @Autowired
    public UserPersonalizationController(UserPersonalizationTransformer transformer, UserPersonalizationService service) {
        super(transformer, service);
    }

    @GetMapping(value = USER_PERSONALIZATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<UserPersonalizationDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = USER_PERSONALIZATION_BASE_URL)
    @Override
    public ResponseEntity<Page<UserPersonalizationDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PostMapping(value = USER_PERSONALIZATION_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<UserPersonalizationDTO> create(@Valid @RequestBody UserPersonalizationDTO dto) {
        return super.create(dto);
    }

    @PutMapping(value = USER_PERSONALIZATION_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<UserPersonalizationDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody UserPersonalizationDTO dto) {
        return super.update(id, dto);
    }

    @DeleteMapping(value = USER_PERSONALIZATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
