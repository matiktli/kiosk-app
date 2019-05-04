package com.kiosk.transformer;

import com.kiosk.dto.UserPersonalizationDTO;
import com.kiosk.model.UserPersonalization;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserPersonalizationTransformer implements BaseTransformer<UserPersonalization, UserPersonalizationDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserPersonalization toEntity(UserPersonalizationDTO source) {
        UserPersonalization result = modelMapper.map(source, UserPersonalization.class);
        return result;
    }

    @Override
    public UserPersonalizationDTO toDto(UserPersonalization source) {
        UserPersonalizationDTO result = modelMapper.map(source, UserPersonalizationDTO.class);
        return result;
    }
}
