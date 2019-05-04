package com.kiosk.service.base;

import com.kiosk.dao.UserRepo;
import com.kiosk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    public UserService(UserRepo repo) {
        super(repo);
    }
}
