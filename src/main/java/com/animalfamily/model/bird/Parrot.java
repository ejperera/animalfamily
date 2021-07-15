package com.animalfamily.model.bird;

public class Parrot extends Bird {

    @Override
    public String sing() {
        return getSoundBehaviour().makeSound();
    }
}
