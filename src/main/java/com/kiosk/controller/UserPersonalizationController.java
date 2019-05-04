package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.UserPersonalizationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserPersonalizationController implements BaseKioskController<UserPersonalizationDTO>{

    @GetMapping(value = USER_BASE_PERSONALIZATION_URL + "/{id}")
    @Override
    public ResponseEntity<UserPersonalizationDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = USER_BASE_PERSONALIZATION_URL)
    @Override
    public ResponseEntity<Page<UserPersonalizationDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = USER_BASE_PERSONALIZATION_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<UserPersonalizationDTO> create(@Valid @RequestBody UserPersonalizationDTO dto) {
        return null;
    }

    @PutMapping(value = USER_BASE_PERSONALIZATION_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<UserPersonalizationDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody UserPersonalizationDTO dto) {
        return null;
    }

    @DeleteMapping(value = USER_BASE_PERSONALIZATION_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
