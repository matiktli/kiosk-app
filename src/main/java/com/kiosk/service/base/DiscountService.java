package com.kiosk.service.base;

import com.kiosk.dao.DiscountRepo;
import com.kiosk.model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService extends BaseService<Discount> {

    @Autowired
    private DiscountRepo discountRepo;

}
