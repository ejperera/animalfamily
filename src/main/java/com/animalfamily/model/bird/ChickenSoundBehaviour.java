package com.animalfamily.model.bird;

import com.animalfamily.model.SoundBehaviour;

public class ChickenSoundBehaviour implements SoundBehaviour {
    private String says = "Cluck , Cluck ";
    @Override
    public String makeSound() {
        return says;
    }
}
