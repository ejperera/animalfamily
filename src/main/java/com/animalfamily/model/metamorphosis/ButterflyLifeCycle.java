package com.animalfamily.model.metamorphosis;

public class ButterflyLifeCycle {

    private MetamorphosisState state;

    public ButterflyLifeCycle() {
        this.state = new Caterpillar();
    }

    public MetamorphosisState getState() {
        return state;
    }

    public void setState(MetamorphosisState state) {
        this.state = state;
    }

    public void nextState(){
        state.transform(this);
    }
}
