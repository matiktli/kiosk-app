package com.kiosk.transformer;

import com.kiosk.dto.LogDTO;
import com.kiosk.model.Log;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogTransformer implements BaseTransformer<Log, LogDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Log toEntity(LogDTO source) {
        Log result = modelMapper.map(source, Log.class);
        return result;
    }

    @Override
    public LogDTO toDto(Log source) {
        LogDTO result = modelMapper.map(source, LogDTO.class);
        return result;
    }
}
