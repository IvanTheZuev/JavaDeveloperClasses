package com.schneider.project.lesson08;

public class Train extends Bicycle{
    private int numberOfCars;
    private boolean isClimateControl;

    public int getNumberOfCars() {
        return numberOfCars;
    }


    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }

    public boolean isNotClimateControl(){
        isClimateControl = !isClimateControl;
    }

    //метод который меняепт значние данного свойства на противоположное


    public Train(String carNumber, int maxSpeed,
                 int numberOfCars, boolean isClimateControl) {
        super(carNumber, maxSpeed);
        this.numberOfCars = numberOfCars;
        this.isClimateControl = isClimateControl;
    }
    @Override // аннотация - необязательная, доступна только на этапе компиляции.
    public void repair(){
        if(numberOfCars < 7 && numberOfCars > 0){
            if(damage >= 2) damage -= 2;
        }   else super.repair();


    }

}
