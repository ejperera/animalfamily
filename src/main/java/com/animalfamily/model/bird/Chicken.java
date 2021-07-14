package com.animalfamily.model.bird;

import com.animalfamily.model.Animal;
import com.animalfamily.model.Singable;
import com.animalfamily.model.Walkable;

public class Chicken extends Animal implements Walkable, Singable {

    @Override
    public String sing() {
        return getSoundBehaviour().makeSound();
    }
}
