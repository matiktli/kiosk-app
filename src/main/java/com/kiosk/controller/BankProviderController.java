package com.kiosk.controller;

import com.kiosk.dto.BankProviderDTO;
import com.kiosk.dto.BaseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class BankProviderController implements BaseKioskController<BankProviderDTO>{

    @GetMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<BankProviderDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = BANK_PROVIDER_BASE_URL)
    @Override
    public ResponseEntity<Page<BankProviderDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = BANK_PROVIDER_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<BankProviderDTO> create(@Valid @RequestBody BankProviderDTO dto) {
        return null;
    }

    @PutMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<BankProviderDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody BankProviderDTO dto) {
        return null;
    }

    @DeleteMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
