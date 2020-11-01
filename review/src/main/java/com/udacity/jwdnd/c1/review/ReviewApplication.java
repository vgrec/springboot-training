package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"com.udacity.jwdnd"})
public class ReviewApplication {

    public static void main(String[] args) {
        System.out.println("Booting server...");
        SpringApplication.run(ReviewApplication.class, args);
    }

}
