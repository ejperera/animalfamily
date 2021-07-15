package com.animalfamily;

import com.animalfamily.model.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalCountSolution {
    
   public AnimalCount getAnimalCountBasedOnBehaviour (Animal[] animals){
       Map<String,Integer> countMap = new HashMap<>();
       int flyCount = 0,walkCount = 0,singCount = 0,swimCount=0;
       for (Animal animal:animals){
           if (animal instanceof Flyable){
               flyCount++;
           }if (animal instanceof Walkable){
               walkCount++;
           }if (animal instanceof Singable){
               singCount++;
           }
           if (animal instanceof Swimmable){
               swimCount++;
           }
       }
      return new AnimalCount( flyCount,  walkCount,  singCount,  swimCount);
   }
}
