package com.kiosk.transformer;

import com.kiosk.dto.TagDTO;
import com.kiosk.model.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TagTransformer implements BaseTransformer<Tag, TagDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Tag toEntity(TagDTO source) {
        Tag result = modelMapper.map(source, Tag.class);
        return result;
    }

    @Override
    public TagDTO toDto(Tag source) {
        TagDTO result = modelMapper.map(source, TagDTO.class);
        return result;
    }
}
