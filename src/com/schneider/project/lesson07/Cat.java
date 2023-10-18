package com.schneider.project.lesson07;

public class Cat {
    public String cat = "Мурзик";
    public int weightOfCat[];
    public int numberOfWins;

    public Cat(String cat){
        if(cat == null){
            throw new IllegalArgumentException("Name of a cat could not be null!");
        }
        this.cat = cat;
    }


    public void setWeightOfCat(int[] weightOfCat) {
        for (int i = 1; i <= 9; i++) {
            weightOfCat[i] = i;
        }
        this.weightOfCat = weightOfCat;
        }

    public void attack(String cat){
        this(Cat);

    }

}

