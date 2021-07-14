package com.animalfamily.model.bird;

import com.animalfamily.model.Singable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    public void testSing(){

        Singable bird = new Bird();
        Assertions.assertEquals(bird.sing(), "I am singing");
    }
}
