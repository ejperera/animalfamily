package com.animalfamily.model.metamorphosis;

public interface MetamorphosisState {

    void transform(ButterflyLifeCycle butterflyLifeCycle);

    String status ();
}
