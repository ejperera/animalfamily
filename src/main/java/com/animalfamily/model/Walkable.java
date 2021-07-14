package com.animalfamily.model;

public interface Walkable {

    default String walk (){
        return "I am walking";
    }
}
