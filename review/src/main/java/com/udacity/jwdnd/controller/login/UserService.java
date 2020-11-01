package com.udacity.jwdnd.controller.login;

import com.udacity.jwdnd.mappers.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
