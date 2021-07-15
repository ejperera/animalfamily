package com.animalfamily;

import com.animalfamily.model.Animal;
import com.animalfamily.model.bird.Bird;
import com.animalfamily.model.bird.Chicken;
import com.animalfamily.model.bird.Duck;
import com.animalfamily.model.bird.Parrot;
import com.animalfamily.model.enums.ChickenType;
import com.animalfamily.model.fish.Clownfish;
import com.animalfamily.model.fish.Dolphin;
import com.animalfamily.model.fish.Fish;
import com.animalfamily.model.fish.Shark;
import com.animalfamily.model.metamorphosis.Butterfly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalCountSolutionTest {

    @Test
    public void testGetAnimalCountBasedOnBehaviour (){

        AnimalCountSolution solution = new AnimalCountSolution();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(ChickenType.CHICKEN),
                new Chicken(ChickenType.ROOSTER),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                //new Frog (),
                // new Dog(),
                new Butterfly(),
                //new Cat()
        };

        AnimalCount animalCount= solution.getAnimalCountBasedOnBehaviour(animals);

        Assertions.assertEquals(animalCount.getFlyCount(),4);
        Assertions.assertEquals(animalCount.getWalkCount(),6);
        Assertions.assertEquals(animalCount.getSingCount(),5);
        Assertions.assertEquals(animalCount.getSwimCount(),5);

    }
}
