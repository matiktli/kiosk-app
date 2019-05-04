package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.LocationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LocationController implements BaseKioskController<LocationDTO>{

    @GetMapping(value = LOCATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<LocationDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = LOCATION_BASE_URL)
    @Override
    public ResponseEntity<Page<LocationDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = LOCATION_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<LocationDTO> create(@Valid @RequestBody LocationDTO dto) {
        return null;
    }

    @PutMapping(value = LOCATION_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<LocationDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody LocationDTO dto) {
        return null;
    }

    @DeleteMapping(value = LOCATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
