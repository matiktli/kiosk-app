package com.kiosk.service.base;

import com.kiosk.dao.UserPersonalizationRepo;
import com.kiosk.model.UserPersonalization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPersonalizationService extends BaseService<UserPersonalization> {

    @Autowired
    public UserPersonalizationService(UserPersonalizationRepo repo) {
        super(repo);
    }
}
