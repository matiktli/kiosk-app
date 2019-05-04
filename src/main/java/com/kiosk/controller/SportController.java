package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.SportDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class SportController implements BaseKioskController<SportDTO>{

    @GetMapping(value = SPORT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<SportDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = SPORT_BASE_URL)
    @Override
    public ResponseEntity<Page<SportDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = SPORT_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<SportDTO> create(@Valid @RequestBody SportDTO dto) {
        return null;
    }

    @PutMapping(value = SPORT_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<SportDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody SportDTO dto) {
        return null;
    }

    @DeleteMapping(value = SPORT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
