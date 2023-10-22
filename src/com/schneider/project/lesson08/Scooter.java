package com.schneider.project.lesson08;

public class Scooter implements ChangeColor{
    boolean isElectric;


    public Scooter(int maxSpeed, boolean isElectric, String typeOfBicycle = "Городской", int numberOfWheels = 2) {
        super(maxSpeed, typeOfBicycle, numberOfWheels);
        this.isElectric = isElectric;
    }


    @Override
    public void changeColor(String) {

    }

    @Override
    public void recoverColor() {

    }
}
