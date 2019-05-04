package com.kiosk.transformer;

import com.kiosk.dto.BankProviderDTO;
import com.kiosk.model.BankProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankProviderTransformer implements BaseTransformer<BankProvider, BankProviderDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public BankProvider toEntity(BankProviderDTO source) {
        BankProvider result = modelMapper.map(source, BankProvider.class);
        return result;
    }

    @Override
    public BankProviderDTO toDto(BankProvider source) {
        BankProviderDTO result = modelMapper.map(source, BankProviderDTO.class);
        return result;
    }
}
