package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.CampusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CampusController implements BaseKioskController<CampusDTO>{

    @GetMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<CampusDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = CAMPUS_BASE_URL)
    @Override
    public ResponseEntity<Page<CampusDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = CAMPUS_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<CampusDTO> create(@Valid @RequestBody CampusDTO dto) {
        return null;
    }

    @PutMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<CampusDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody CampusDTO dto) {
        return null;
    }

    @DeleteMapping(value = CAMPUS_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
