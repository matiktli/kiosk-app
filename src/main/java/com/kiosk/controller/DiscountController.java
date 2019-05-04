package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.DiscountDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class DiscountController implements BaseKioskController<DiscountDTO>{

    @GetMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<DiscountDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = DISCOUNT_BASE_URL)
    @Override
    public ResponseEntity<Page<DiscountDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = DISCOUNT_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<DiscountDTO> create(@Valid @RequestBody DiscountDTO dto) {
        return null;
    }

    @PutMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<DiscountDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody DiscountDTO dto) {
        return null;
    }

    @DeleteMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
