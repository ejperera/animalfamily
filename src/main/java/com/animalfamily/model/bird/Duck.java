package com.animalfamily.model.bird;

import com.animalfamily.model.Swimmable;

public class Duck extends Bird implements Swimmable {

    @Override
    public String sing() {
        return getSoundBehaviour().makeSound();
    }
}
