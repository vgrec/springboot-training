package com.udacity.jwdnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    private boolean firstVisit = true;

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("welcomeMessage", "Hi, hello!");
        model.addAttribute("greetings", Arrays.asList(
                "John", "Mobs", "Lavilas"
        ));
        model.addAttribute("cat", new Cat());

        return "home";
    }

    @RequestMapping("/simple-home")
    public String getSimpleHome(Model model) {
        model.addAttribute("firstVisit", firstVisit);
        firstVisit = false;
        return "simple-home";
    }

    private static class Cat {
        private int speed = 2;

        public int getSpeed() {
            return speed;
        }
    }

}
