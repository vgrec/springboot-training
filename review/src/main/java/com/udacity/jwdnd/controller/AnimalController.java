package com.udacity.jwdnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    private List<Animal> animals = new ArrayList<>();

    @GetMapping
    public String getAnimal(@ModelAttribute("messageForm") Animal messageForm, Model model) {
        model.addAttribute("animals", animals);
        return "animal";
    }

    @PostMapping
    public String postAnimal(@ModelAttribute("messageForm") Animal messageForm, Model model) {
        animals.add(messageForm);
        model.addAttribute("animals", animals);
        return "animal";
    }

}
