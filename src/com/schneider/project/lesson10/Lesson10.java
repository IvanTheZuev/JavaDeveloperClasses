package com.schneider.project.lesson10;

import com.schneider.project.lesson10.clonequals.AppAuth;
import com.schneider.project.lesson10.clonequals.Auth;
import com.schneider.project.lesson10.clonequals.GAuth;
import com.schneider.project.lesson10.clonequals.Item;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Item item01 = new Item("ghghgh", 23);
        System.out.println(item01);

        Item item02 = new Item("ghghgh", 23);
        System.out.println(item01.equals(item02));

        Item copyItem = item01.clone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("имя пользователя");
        String userName = scanner.nextLine();

        System.out.println("Пароль");
        String password = scanner.nextLine();

        System.out.println("Способ авторизации");

        String authType = scanner.nextLine();
        //Auth auth; // объявление переменой
        //if (authType.equals("github")){
            //auth = new GAuth;
     //   }
        //else{
           // auth = new AppAuth();
        //}
        //auth.login(userName, password);

    }

}
