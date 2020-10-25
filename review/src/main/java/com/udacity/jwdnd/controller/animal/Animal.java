package com.udacity.jwdnd.controller.animal;

public class Animal {
    private String animalName;
    private String adjective;

    public String getAdjective() {
        return adjective;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
