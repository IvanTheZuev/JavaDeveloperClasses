package com.schneider.project.lesson08;

//транспортное средство
public class CarMegan {
    protected String carNumber; //null
    protected int damage; //0
    protected int maxSpeed = 120; //120 по условию задачи

    public CarMegan(String carNumber){
        this.carNumber = carNumber;
    }

    public CarMegan(String carNumber, int maxSpeed){
        this(carNumber);
        this.maxSpeed = maxSpeed;
    }

    public String getCarNumber(){
        return carNumber;
    }
    public int getDamage(){
        return damage;
    }
    public int incDamage(int value){
        if (value < 0) return;
        damage += value;
        return value;
    }

    public void repair(){
        if(damage > 0) damage--;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
