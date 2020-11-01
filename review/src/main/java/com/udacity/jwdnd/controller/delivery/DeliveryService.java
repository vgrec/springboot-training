package com.udacity.jwdnd.controller.delivery;

import com.udacity.jwdnd.mappers.DeliveryMapper;
import com.udacity.jwdnd.mappers.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
//
//    private DeliveryMapper deliveryMapper;
//
//    public DeliveryService(DeliveryMapper deliveryMapper) {
//        this.deliveryMapper = deliveryMapper;
//    }

    private UserMapper userMapper;

    public DeliveryService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
