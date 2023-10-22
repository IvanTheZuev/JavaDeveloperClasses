package com.schneider.project.lesson08;

public class Point {
    private int x;
    private int y;

    public final void printInfo(){
        // методы с final не могут быть переопределены в дочернем классе
        System.out.println(x);
        System.out.println(y);
    }

}
