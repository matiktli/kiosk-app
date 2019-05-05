package com.kiosk.controller;

import com.kiosk.dto.BankProviderDTO;
import com.kiosk.dto.BaseDTO;
import com.kiosk.model.BankProvider;
import com.kiosk.service.base.BankProviderService;
import com.kiosk.transformer.BankProviderTransformer;
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
public class BankProviderController extends BaseController<BankProviderDTO, BankProvider>{

    @Autowired
    public BankProviderController(BankProviderTransformer transformer, BankProviderService service) {
        super(transformer, service);
    }

    @GetMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<BankProviderDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = BANK_PROVIDER_BASE_URL)
    @Override
    public ResponseEntity<Page<BankProviderDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = BANK_PROVIDER_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<BankProviderDTO> create(@Valid @RequestBody BankProviderDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<BankProviderDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody BankProviderDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = BANK_PROVIDER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
