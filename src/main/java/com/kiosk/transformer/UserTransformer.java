package com.kiosk.transformer;

import com.kiosk.dto.UserDTO;
import com.kiosk.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserTransformer implements BaseTransformer<User, UserDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public User toEntity(UserDTO source) {
        User result = modelMapper.map(source, User.class);
        return result;
    }

    @Override
    public UserDTO toDto(User source) {
        UserDTO result = modelMapper.map(source, UserDTO.class);
        return result;
    }
}
