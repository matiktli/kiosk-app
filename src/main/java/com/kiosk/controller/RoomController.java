package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.RoomDTO;
import com.kiosk.model.Room;
import com.kiosk.service.base.RoomService;
import com.kiosk.transformer.RoomTransformer;
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
public class RoomController extends BaseController<RoomDTO, Room> {

    @Autowired
    public RoomController(RoomTransformer transformer, RoomService service) {
        super(transformer, service);
    }

    @GetMapping(value = ROOM_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<RoomDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = ROOM_BASE_URL)
    @Override
    public ResponseEntity<Page<RoomDTO>> findAll(@PageableDefault(size = 1000) Pageable page) {
        return super.findAll(page);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping(value = ROOM_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<RoomDTO> create(@Valid @RequestBody RoomDTO dto) {
        return super.create(dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping(value = ROOM_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<RoomDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody RoomDTO dto) {
        return super.update(id, dto);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = ROOM_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
}
