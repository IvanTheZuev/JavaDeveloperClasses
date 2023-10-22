package com.schneider.project.hometask10;

import com.schneider.project.hometask10.Animals.Wolf;

public class hometask10 {
    public static void main(String[] args) {
        Wolf wolf01 = new Wolf(new String[]{"meat", "apple", "something else"}, "White");
        Wolf wolf02 = new Wolf(new String[]{"meat", "apple", "something else"}, "White");

        System.out.println(wolf01.equals(wolf02));

    }
}
