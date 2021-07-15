package com.animalfamily.model.fish;

import com.animalfamily.model.enums.ColorEnum;
import com.animalfamily.model.enums.SizeEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClownFishTest {

    @Test
    public void testClownFish(){

        Clownfish clownFish = new Clownfish();
        Assertions.assertEquals(clownFish.swim(), "I am swimming");
        Assertions.assertEquals(clownFish.sayJoke(), "I am joking");

        Assertions.assertEquals(clownFish.getColor(), ColorEnum.ORANGE);

        Assertions.assertEquals(clownFish.getSize(), SizeEnum.SMALL);
    }
}
