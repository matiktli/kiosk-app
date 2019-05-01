package com.kiosk.service.base;

import com.kiosk.dao.BankProviderRepo;
import com.kiosk.model.BankProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankProviderService extends BaseService<BankProvider> {

    @Autowired
    private BankProviderRepo bankProviderRepo;

}
