package com.kiosk.transformer;

import com.kiosk.dto.RoomDTO;
import com.kiosk.model.Room;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoomTransformer implements BaseTransformer<Room, RoomDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Room toEntity(RoomDTO source) {
        Room result = modelMapper.map(source, Room.class);
        return result;
    }

    @Override
    public RoomDTO toDto(Room source) {
        RoomDTO result = modelMapper.map(source, RoomDTO.class);
        return result;
    }
}
