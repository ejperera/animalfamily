package com.animalfamily.model.metamorphosis;

import com.animalfamily.model.Animal;
import com.animalfamily.model.Flyable;
import com.animalfamily.model.Walkable;

public class Butterfly  extends Animal implements MetamorphosisState ,Flyable, Walkable {

    @Override
    public void transform(ButterflyLifeCycle butterflyLifeCycle) {
        // in final stage 
    }

    @Override
    public String status() {
        return "I'm Butterfly";
    }
}
