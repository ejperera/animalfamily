package com.animalfamily.model.fish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SharkTest {
    @Test
    public void testShark(){

        Shark shark = new Shark();
        Assertions.assertEquals(shark.swim(), "I am swimming");
        Assertions.assertEquals(shark.eat(), "I eating other fishes");
    }
}
