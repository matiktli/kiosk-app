package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController implements BaseKioskController<UserDTO>{

    @GetMapping(value = USER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<UserDTO> getById(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping(value = USER_BASE_URL)
    @Override
    public ResponseEntity<Page<UserDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return null;
    }

    @PostMapping(value = USER_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO dto) {
        return null;
    }

    @PutMapping(value = USER_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<UserDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody UserDTO dto) {
        return null;
    }

    @DeleteMapping(value = USER_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return null;
    }
}
