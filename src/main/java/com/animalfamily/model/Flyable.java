package com.animalfamily.model;

public interface Flyable {

    default String fly (){
        return "I am flying";
    }
}
