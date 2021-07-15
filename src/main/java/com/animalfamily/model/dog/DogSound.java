package com.animalfamily.model.dog;

import com.animalfamily.model.SoundBehaviour;

public class DogSound implements SoundBehaviour {

    private String says ="Woof, woof";
    @Override
    public String makeSound() {
        return says;
    }
}
