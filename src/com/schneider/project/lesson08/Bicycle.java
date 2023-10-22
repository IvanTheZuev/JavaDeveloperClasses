package com.schneider.project.lesson08;

public class Bicycle extends CarMegan{
    private int numOfWheels = 2;
    private String typeOfBicycle = " Городской";

    public int getNumOfTires() {

        return numOfWheels;
    }

    public String getTypeOfBicycle() {

        return typeOfBicycle;
    }
    public Bicycle(String s, int i){

        super("45");
    }

    public Bicycle(int maxSpeed) {
        super(carNumber, maxSpeed);
        this.numOfWheels = numOfWheels;
    }

}
