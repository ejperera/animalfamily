package com.animalfamily.model.bird;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    public void testSing(){

        Duck duck= new Duck();
        duck.setSoundBehaviour(new DuckSound());
        Assertions.assertEquals(duck.sing(), "Quack , quack");
    }
}
