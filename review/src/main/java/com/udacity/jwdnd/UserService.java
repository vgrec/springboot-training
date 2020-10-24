package com.udacity.jwdnd;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public String getUser(){
        return "John";
    }
}
