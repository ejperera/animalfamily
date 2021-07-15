package com.animalfamily.model;

import com.animalfamily.model.enums.ColorEnum;
import com.animalfamily.model.enums.SizeEnum;

public class Animal {

    private SoundBehaviour soundBehaviour;
    private SizeEnum size;
    private ColorEnum color;

    public Animal() {
    }
    
    public Animal(SizeEnum size, ColorEnum color) {
        this.size = size;
        this.color = color;
    }

    public SoundBehaviour getSoundBehaviour() {
        return soundBehaviour;
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }
}
