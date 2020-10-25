package com.udacity.jwdnd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    @Qualifier("message")
    public String message() {
        return "Hello, message";
    }

    @Bean
    @Qualifier("uppercase")
    public String uppercaseMessage(MessageService messageService) {
        String uppercase = messageService.uppercase();
        System.out.println(uppercase);
        return uppercase;
    }

    @Bean
    @Qualifier("lowercase")
    public String lowercaseMessage(MessageService messageService) {
        String lowercase = messageService.lowercase();
        System.out.println(lowercase);
        return lowercase;
    }

}
