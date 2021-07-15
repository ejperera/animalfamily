package com.animalfamily.model.bird;

import com.animalfamily.model.SoundBehaviour;

public class DuckSound implements SoundBehaviour {

    private String says = "Quack , quack";
    @Override
    public String makeSound() {
        return says;
    }
}
