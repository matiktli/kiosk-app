package com.kiosk.transformer;

import com.kiosk.dto.SportDTO;
import com.kiosk.model.Sport;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SportTransformer implements BaseTransformer<Sport, SportDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Sport toEntity(SportDTO source) {
        Sport result = modelMapper.map(source, Sport.class);
        return result;
    }

    @Override
    public SportDTO toDto(Sport source) {
        SportDTO result = modelMapper.map(source, SportDTO.class);
        return result;
    }
}
