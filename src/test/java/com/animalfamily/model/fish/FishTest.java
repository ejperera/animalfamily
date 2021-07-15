package com.animalfamily.model.fish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FishTest {

    @Test
    public void testSwim(){

        Fish fish = new Fish();
        Assertions.assertEquals(fish.swim(), "I am swimming");
    }
}
