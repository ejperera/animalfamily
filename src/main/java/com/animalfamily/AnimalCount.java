package com.animalfamily;

public class AnimalCount {

   private int flyCount ;
    private int  walkCount;
    private int singCount;

    private int swimCount;

    public int getFlyCount() {
        return flyCount;
    }

    public int getWalkCount() {
        return walkCount;
    }

    public int getSingCount() {
        return singCount;
    }

    public int getSwimCount() {
        return swimCount;
    }


    public AnimalCount(int flyCount, int walkCount, int singCount, int swimCount) {
        this.flyCount = flyCount;
        this.walkCount = walkCount;
        this.singCount = singCount;
        this.swimCount = swimCount;
    }
}
