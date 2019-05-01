package com.kiosk.transformer;

import com.kiosk.dto.DiscountDTO;
import com.kiosk.model.Discount;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscountTransformer implements BaseTransformer<Discount, DiscountDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Discount toEntity(DiscountDTO source) {
        Discount result = modelMapper.map(source, Discount.class);
        return result;
    }

    @Override
    public DiscountDTO toDto(Discount source) {
        DiscountDTO result = modelMapper.map(source, DiscountDTO.class);
        return result;
    }
}
