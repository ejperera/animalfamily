package com.animalfamily.model.fish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DolphinTest {

    @Test
    public void testDolphin() {

        Dolphin dolphin = new Dolphin();

        Assertions.assertEquals(dolphin.swim(), "I am swimming");
    }
}
