package com.animalfamily.model.bird;

import com.animalfamily.model.Animal;
import com.animalfamily.model.Singable;
import com.animalfamily.model.Walkable;
import com.animalfamily.model.enums.ChickenType;

public class Chicken extends Animal implements Walkable, Singable {

    private ChickenType chickenType;

    public Chicken(ChickenType chickenType) {
        super();
        this.chickenType = chickenType;
    }

    public ChickenType getChickenType() {
        return chickenType;
    }
    
    @Override
    public String sing() {
        return getSoundBehaviour().makeSound();
    }
}
