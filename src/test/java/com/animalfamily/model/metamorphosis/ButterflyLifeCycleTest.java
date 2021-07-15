package com.animalfamily.model.metamorphosis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButterflyLifeCycleTest {

    @Test
    public void testButterflyLifeCycle(){

        ButterflyLifeCycle butterflyLifeCycle = new ButterflyLifeCycle();

        Assertions.assertNotNull(butterflyLifeCycle.getState());
        Assertions.assertEquals(butterflyLifeCycle.getState().status(),"I'm Caterpillar");
        Assertions.assertEquals(((Caterpillar)butterflyLifeCycle.getState()).walk(),"crawling");

        butterflyLifeCycle.nextState();

        Assertions.assertNotNull(butterflyLifeCycle.getState());
        Assertions.assertEquals(butterflyLifeCycle.getState().status(),"I'm Butterfly");

    }
}
