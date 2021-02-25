package com.CryptoApp.service;

import com.CryptoApp.model.Role;
import com.CryptoApp.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User findUserByEmail(String email) ;
    User saveUser(User user, Role role);
}