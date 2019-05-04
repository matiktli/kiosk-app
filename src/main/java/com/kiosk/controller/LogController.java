package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.LogDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LogController implements BaseKioskController<LogDTO>{

    @GetMapping(value = LOG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<LogDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = LOG_BASE_URL)
    @Override
    public ResponseEntity<Page<LogDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = LOG_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<LogDTO> create(@Valid @RequestBody LogDTO dto) {
        return null;
    }

    @PutMapping(value = LOG_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<LogDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody LogDTO dto) {
        return null;
    }

    @DeleteMapping(value = LOG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
