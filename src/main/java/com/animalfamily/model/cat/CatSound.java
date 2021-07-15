package com.animalfamily.model.cat;

import com.animalfamily.model.SoundBehaviour;

public class CatSound implements SoundBehaviour {
    private String says = "Me ow";
    @Override
    public String makeSound() {
        return says;
    }   
}
