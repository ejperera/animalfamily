package com.animalfamily.model.bird;

import com.animalfamily.model.SoundBehaviour;

public class RoosterSoundBehaviour implements SoundBehaviour {

    private String says = "Cock-a-doodle-doo";
    @Override
    public String makeSound() {
        return says;
    }
}
