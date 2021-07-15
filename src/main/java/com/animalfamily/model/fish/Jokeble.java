package com.animalfamily.model.fish;

public interface Jokeble {
    default String sayJoke (){
        return "I am joking";
    }
}
