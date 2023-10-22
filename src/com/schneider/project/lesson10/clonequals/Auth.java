package com.schneider.project.lesson10.clonequals;

public interface Auth {
    boolean login(String userName, String password);
    boolean logout();
}
