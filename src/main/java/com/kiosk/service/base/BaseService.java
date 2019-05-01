package com.kiosk.service.base;

import com.kiosk.model.BaseEntity;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService<C extends BaseEntity> {
}
