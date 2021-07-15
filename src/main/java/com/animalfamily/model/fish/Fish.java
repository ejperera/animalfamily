package com.animalfamily.model.fish;

import com.animalfamily.model.Animal;
import com.animalfamily.model.Swimmable;
import com.animalfamily.model.enums.ColorEnum;
import com.animalfamily.model.enums.SizeEnum;

public class Fish extends Animal implements Swimmable {

    public Fish() {
        super();
    }
    
    public Fish(SizeEnum size, ColorEnum color) {
        super( size,  color);
    }
}
