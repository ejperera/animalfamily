package com.animalfamily.model.bird;

import com.animalfamily.model.InfluencedSound;
import com.animalfamily.model.PhoneRingingSound;
import com.animalfamily.model.cat.CatSound;
import com.animalfamily.model.dog.DogSound;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParrotTest {

    @Test
    public void testSing(){

        Parrot parrotLiveWithRooster = new Parrot();
        parrotLiveWithRooster.setSoundBehaviour( new InfluencedSound( new RoosterSound()));
        Assertions.assertEquals(parrotLiveWithRooster.sing(), "Cock-a-doodle-doo");

        Parrot parrotLiveWithDog = new Parrot( );
        parrotLiveWithDog.setSoundBehaviour(new InfluencedSound( new DogSound()));
        Assertions.assertEquals(parrotLiveWithDog.sing(), "Woof, woof");

        Parrot parrotLiveWithCat =  new Parrot( );
        parrotLiveWithCat.setSoundBehaviour(new InfluencedSound( new CatSound()));
        Assertions.assertEquals(parrotLiveWithCat.sing(), "Me ow");

        Parrot parrotLiveWithDuck = new Parrot( );
        parrotLiveWithDuck.setSoundBehaviour( new InfluencedSound( new DuckSound()));
        Assertions.assertEquals(parrotLiveWithDuck.sing(), "Quack , quack");

        Parrot parrotLiveNearPhone =  new Parrot( );
        parrotLiveNearPhone.setSoundBehaviour(new InfluencedSound( new PhoneRingingSound()));
        Assertions.assertEquals(parrotLiveNearPhone.sing(), "phone ringing tone");
    }
}
