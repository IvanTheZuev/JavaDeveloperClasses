package com.schneider.project.lesson08;

public class AutoMobile extends CarMegan{
    private String color = "White";

    public AutoMobile(String carNumber, int maxSpeed = 240, String color) {
        super(carNumber, maxSpeed);
        this.color = color;
    }

    @Override
    public void repair() {
        super.repair();
    }

    public void setColor(String color) {
        this.color = color;
    }
}
