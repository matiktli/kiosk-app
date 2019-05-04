package com.kiosk.transformer;

import com.kiosk.dto.CampusDTO;
import com.kiosk.model.Campus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CampusTransformer implements BaseTransformer<Campus, CampusDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Campus toEntity(CampusDTO source) {
        Campus result = modelMapper.map(source, Campus.class);
        return result;
    }

    @Override
    public CampusDTO toDto(Campus source) {
        CampusDTO result = modelMapper.map(source, CampusDTO.class);
        return result;
    }
}
