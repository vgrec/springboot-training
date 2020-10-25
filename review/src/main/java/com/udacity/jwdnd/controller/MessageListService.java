package com.udacity.jwdnd.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {
    private List<String> messges;

    @PostConstruct
    public void postConstruct() {
        this.messges = new ArrayList<>();
    }

    public void addMessage(String message) {
        messges.add(message);
    }

    public List<String> getMessges() {
        return new ArrayList<>(messges);
    }
}
