package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.EventDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class EventController implements BaseKioskController<EventDTO>{

    @GetMapping(value = EVENT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<EventDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = EVENT_BASE_URL)
    @Override
    public ResponseEntity<Page<EventDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = EVENT_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<EventDTO> create(@Valid @RequestBody EventDTO dto) {
        return null;
    }

    @PutMapping(value = EVENT_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<EventDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody EventDTO dto) {
        return null;
    }

    @DeleteMapping(value = EVENT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
