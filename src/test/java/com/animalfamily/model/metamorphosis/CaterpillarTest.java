package com.animalfamily.model.metamorphosis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaterpillarTest {

    @Test
    public void testCaterpillar(){

        Butterfly butterfly = new Butterfly();
        Assertions.assertEquals(butterfly.walk(), "I am walking");
    }
}
