package com.animalfamily.model.fish;

public interface Predatory {

    default String eat (){
        return "I eating other fishes";
    }
}
