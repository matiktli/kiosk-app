package com.kiosk.service.base;

import com.kiosk.dao.DiscountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService extends BaseService {

    @Autowired
    private DiscountRepo discountRepo;

}
