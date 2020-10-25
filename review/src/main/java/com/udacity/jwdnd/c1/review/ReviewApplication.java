package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"com.udacity.jwdnd"})
public class ReviewApplication {

    public static void main(String[] args) {
        System.out.println("Hello Vanea");
        SpringApplication.run(ReviewApplication.class, args);
    }

    @Bean
    public int pringSize(UserService userService) {
        System.out.println(userService.getUser());
        return 2;
    }

    @Bean
    @Qualifier("prep")
    public String prepareMessage() {
        System.out.println("Preparing message...");
        return "message";
    }

    @Bean
    @Qualifier("composing")
    public String compoundMessage(@Qualifier("prep") String message) {
        System.out.println("Compsing messge: " + message);
        return "Composed message: " + message;
    }

    @Bean
    public String compoundMessageBig(@Qualifier("composing") String message) {
        System.out.println("Compsing messge big: " + message);
        return "Composed message big: " + message;
    }

}
