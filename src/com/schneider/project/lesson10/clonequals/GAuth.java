package com.schneider.project.lesson10.clonequals;

public class GAuth implements Auth {

    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
