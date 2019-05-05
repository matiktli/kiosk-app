package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.DiscountDTO;
import com.kiosk.model.Discount;
import com.kiosk.service.base.DiscountService;
import com.kiosk.transformer.DiscountTransformer;
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
public class DiscountController extends BaseController<DiscountDTO, Discount> {

    @Autowired
    public DiscountController(DiscountTransformer transformer, DiscountService service) {
        super(transformer, service);
    }

    @GetMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<DiscountDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = DISCOUNT_BASE_URL)
    @Override
    public ResponseEntity<Page<DiscountDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = DISCOUNT_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<DiscountDTO> create(@Valid @RequestBody DiscountDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<DiscountDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody DiscountDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = DISCOUNT_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
