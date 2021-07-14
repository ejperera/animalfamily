package com.animalfamily.model.bird;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChickenTest {

    @Test
    public void testSing(){

        Chicken chicken= new Chicken();
        chicken.setSoundBehaviour(new ChickenSoundBehaviour());       
        Assertions.assertEquals(chicken.sing(), "Cluck , Cluck ");
    }
}
