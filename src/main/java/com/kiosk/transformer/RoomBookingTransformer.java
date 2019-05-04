package com.kiosk.transformer;

import com.kiosk.dto.RoomBookingDTO;
import com.kiosk.model.RoomBooking;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomBookingTransformer implements BaseTransformer<RoomBooking, RoomBookingDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public RoomBooking toEntity(RoomBookingDTO source) {
        RoomBooking result = modelMapper.map(source, RoomBooking.class);
        return result;
    }

    @Override
    public RoomBookingDTO toDto(RoomBooking source) {
        RoomBookingDTO result = modelMapper.map(source, RoomBookingDTO.class);
        return result;
    }
}
