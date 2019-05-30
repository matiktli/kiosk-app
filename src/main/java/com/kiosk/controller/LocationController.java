package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.LocationDTO;
import com.kiosk.model.Location;
import com.kiosk.service.base.LocationService;
import com.kiosk.transformer.LocationTransformer;
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
public class LocationController extends BaseController<LocationDTO, Location> {

    @Autowired
    public LocationController(LocationTransformer transformer, LocationService service) {
        super(transformer, service);
    }

    @GetMapping(value = LOCATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<LocationDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = LOCATION_BASE_URL)
    @Override
    public ResponseEntity<Page<LocationDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = LOCATION_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<LocationDTO> create(@Valid @RequestBody LocationDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = LOCATION_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<LocationDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody LocationDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = LOCATION_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
