package com.animalfamily.model.bird;

import com.animalfamily.model.enums.ChickenType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoosterTest {

    @Test
    public void testSing(){
        Chicken rooster= new Chicken(ChickenType.ROOSTER);
        rooster.setSoundBehaviour(new RoosterSoundBehaviour());
        Assertions.assertEquals(rooster.getChickenType(), ChickenType.ROOSTER);
        Assertions.assertEquals(rooster.sing(), "Cock-a-doodle-doo");
    }
}
