package com.kiosk.transformer;

import com.kiosk.dto.LocationDTO;
import com.kiosk.model.Location;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationTransformer implements BaseTransformer<Location, LocationDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Location toEntity(LocationDTO source) {
        Location result = modelMapper.map(source, Location.class);
        return result;
    }

    @Override
    public LocationDTO toDto(Location source) {
        LocationDTO result = modelMapper.map(source, LocationDTO.class);
        return result;
    }
}
