package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.LogDTO;
import com.kiosk.model.Log;
import com.kiosk.service.base.LogService;
import com.kiosk.transformer.LogTransformer;
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
public class LogController extends BaseController<LogDTO, Log> {

    @Autowired
    public LogController(LogTransformer transformer, LogService service) {
        super(transformer, service);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(value = LOG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<LogDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(value = LOG_BASE_URL)
    @Override
    public ResponseEntity<Page<LogDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = LOG_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<LogDTO> create(@Valid @RequestBody LogDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = LOG_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<LogDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody LogDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = LOG_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
