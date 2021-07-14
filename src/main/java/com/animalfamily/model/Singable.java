package com.animalfamily.model;

public interface Singable {
    default String sing(){
        return "I am singing";
    }
}
