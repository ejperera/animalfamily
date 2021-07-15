package com.animalfamily.model.bird;

import com.animalfamily.model.SoundBehaviour;

public class ChickenSound implements SoundBehaviour {
    private String says = "Cluck , Cluck ";
    @Override
    public String makeSound() {
        return says;
    }
}
