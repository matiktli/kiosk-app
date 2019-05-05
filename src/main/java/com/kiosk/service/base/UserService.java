package com.kiosk.service.base;

import com.kiosk.dao.UserRepo;
import com.kiosk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepo repo) {
        super(repo);
    }

    public Optional<User> findByEmail(String email) {
        return ((UserRepo) repo).findByEmail(email);
    }


    @Override
    public User save(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return super.save(entity);
    }
}
