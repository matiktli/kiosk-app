package com.kiosk.transformer;

import com.kiosk.dto.BaseDTO;
import com.kiosk.model.BaseEntity;


public interface BaseTransformer<E extends BaseEntity,D extends BaseDTO> {

    E toEntity(D source);

    D toDto(E source);
}
