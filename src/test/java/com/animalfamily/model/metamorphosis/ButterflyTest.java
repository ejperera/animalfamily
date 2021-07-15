package com.animalfamily.model.metamorphosis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButterflyTest {

    @Test
    public void testButterfly(){

        Butterfly butterfly = new Butterfly();
        Assertions.assertEquals(butterfly.fly(), "I am flying");
        Assertions.assertEquals(butterfly.walk(), "I am walking");
    }
}
