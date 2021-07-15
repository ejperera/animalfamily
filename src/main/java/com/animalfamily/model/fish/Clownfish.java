package com.animalfamily.model.fish;
import com.animalfamily.model.enums.ColorEnum;
import com.animalfamily.model.enums.SizeEnum;

public class Clownfish extends Fish implements Jokeble {

    public Clownfish() {
        super( SizeEnum.SMALL , ColorEnum.ORANGE);
    }
}
