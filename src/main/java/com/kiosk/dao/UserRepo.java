package com.kiosk.dao;

import com.kiosk.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends BaseRepo<User> {

    Optional<User> findByEmail(String email);
}
