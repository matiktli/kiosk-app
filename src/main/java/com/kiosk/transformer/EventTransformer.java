package com.kiosk.transformer;

import com.kiosk.dto.EventDTO;
import com.kiosk.model.Event;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventTransformer implements BaseTransformer<Event, EventDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Event toEntity(EventDTO source) {
        Event result = modelMapper.map(source, Event.class);
        return result;
    }

    @Override
    public EventDTO toDto(Event source) {
        EventDTO result = modelMapper.map(source, EventDTO.class);
        return result;
    }
}
