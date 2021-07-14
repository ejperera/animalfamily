package com.animalfamily.model;

public interface Swimmable {

    default String swim() {
        return "I am swimming";
    }
}
