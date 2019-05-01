package com.kiosk.service.base;

import com.kiosk.dao.UserPersonalizationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPersonalizationService extends BaseService {

    @Autowired
    private UserPersonalizationRepo userPersonalizationRepo;

}
