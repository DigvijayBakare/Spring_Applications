package com.springmvc.service;

import com.springmvc.daoImpl.UserDaoImpl;
import com.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDaoImpl userDaoImpl;

    public int createUser(User user) {
        return this.userDaoImpl.saveUser(user);
    }
}
