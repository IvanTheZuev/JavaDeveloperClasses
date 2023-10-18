package com.schneider.project.lesson08;

public class Scooter extends Bicycle{
    boolean isElectric;


    public Scooter(int maxSpeed, boolean isElectric, String typeOfBicycle = "Городской", int numberOfWheels = 2) {
        super(maxSpeed, typeOfBicycle, numberOfWheels);
        this.isElectric = isElectric;
    }


}
