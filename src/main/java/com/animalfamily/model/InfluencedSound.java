package com.animalfamily.model;

public class InfluencedSound implements SoundBehaviour {

    private SoundBehaviour influenceBy;

    public InfluencedSound(SoundBehaviour influenceBy) {
        this.influenceBy = influenceBy;
    }

    @Override
    public String makeSound() {
        return  this.influenceBy.makeSound();
    }
}
