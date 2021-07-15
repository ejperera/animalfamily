package com.animalfamily.model.metamorphosis;

import com.animalfamily.model.Animal;
import com.animalfamily.model.CrawlBehaviour;
import com.animalfamily.model.Walkable;

public class Caterpillar extends Animal implements MetamorphosisState , Walkable {

    public Caterpillar() {
        setWalkingBehaviour(new CrawlBehaviour());
    }
    @Override
    public void transform(ButterflyLifeCycle butterflyLifeCycle) {
        butterflyLifeCycle.setState(new Butterfly());
    }

    @Override
    public String walk() {
        return getWalkingBehaviour().walk();
    }

    @Override
    public String status() {
        return "I'm Caterpillar";
    }
    
}
