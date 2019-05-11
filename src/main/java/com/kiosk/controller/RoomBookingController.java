package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.dto.RoomBookingDTO;
import com.kiosk.model.RoomBooking;
import com.kiosk.service.base.RoomBookingService;
import com.kiosk.transformer.RoomBookingTransformer;
import io.swagger.annotations.ApiModelProperty;
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
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RoomBookingController extends BaseController<RoomBookingDTO, RoomBooking> {

    @Autowired
    public RoomBookingController(RoomBookingTransformer transformer, RoomBookingService service) {
        super(transformer, service);
    }

    @GetMapping(value = ROOM_BOOKING_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<RoomBookingDTO> getById(@PathVariable("id") Integer id) {
        return super.getById(id);
    }

    @GetMapping(value = ROOM_BOOKING_BASE_URL)
    @Override
    public ResponseEntity<Page<RoomBookingDTO>> findAll(@PageableDefault(size = 25) Pageable page) {
        return super.findAll(page);
    }

    @ApiModelProperty("Book a room")
    @PreAuthorize("hasAuthority('ADMIN') || isUserMatching(#dto.userId)")
    @PostMapping(value = ROOM_BOOKING_BASE_URL)
    @Validated(BaseDTO.CreateValidationGroup.class)
    @Override
    public ResponseEntity<RoomBookingDTO> create(@Valid @RequestBody RoomBookingDTO dto) {
        RoomBooking bookedRoom = ((RoomBookingService) super.service).createBooking(transformer.toEntity(dto));
        return ResponseEntity.ok(transformer.toDto(bookedRoom));
    }

    @PreAuthorize("hasAuthority('ADMIN') || isUserMatching(#dto.userId)")
    @PutMapping(value = ROOM_BOOKING_BASE_URL + "/{id}")
    @Validated(BaseDTO.UpdateValidationGroup.class)
    @Override
    public ResponseEntity<RoomBookingDTO> update(@PathVariable("id") Integer id,
                                                  @Valid @RequestBody RoomBookingDTO dto) {
        RoomBooking bookedRoom = ((RoomBookingService) super.service).updateBooking(id, transformer.toEntity(dto));
        return ResponseEntity.ok(transformer.toDto(bookedRoom));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value = ROOM_BOOKING_BASE_URL + "/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }

    @GetMapping(value = ROOM_BOOKING_BASE_URL)
    public ResponseEntity<List<RoomBookingDTO>> findAllBookingsForRoom(@RequestParam("roomId") Integer roomId,
                                                                       @RequestParam(value = "fromDate", required = false) Timestamp fromDate,
                                                                       @RequestParam(value = "toDate", required = false) Timestamp toDate) {
        List<RoomBooking> foundBookings = ((RoomBookingService) service).findAllBookingsForRoom(roomId, fromDate, toDate);
        List<RoomBookingDTO> result = foundBookings.stream().map(transformer::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }
}
