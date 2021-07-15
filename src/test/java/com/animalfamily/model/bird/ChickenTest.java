package com.animalfamily.model.bird;

import com.animalfamily.model.enums.ChickenType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChickenTest {

    @Test
    public void testSing(){

        Chicken chicken= new Chicken(ChickenType.CHICKEN);
        chicken.setSoundBehaviour(new ChickenSound());
        Assertions.assertEquals(chicken.getChickenType(), ChickenType.CHICKEN);
        Assertions.assertEquals(chicken.sing(), "Cluck , Cluck ");
    }
}
