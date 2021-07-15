package com.animalfamily.model;

public class PhoneRingingSound implements SoundBehaviour{
    private String says = "phone ringing tone";

    @Override
    public String makeSound() {
        return says;
    }
}
