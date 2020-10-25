package com.udacity.jwdnd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private String message;

    public MessageService(@Qualifier("message") String message) {
        this.message = message;
    }

    String uppercase() {
        return message.toUpperCase();
    }

    String lowercase() {
        return message.toLowerCase();
    }

}
