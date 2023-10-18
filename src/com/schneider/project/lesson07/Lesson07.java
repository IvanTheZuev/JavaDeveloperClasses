package com.schneider.project.lesson07;

public class Lesson07 {
    public static void main(String[] args) {
        Author author01 = new Author(34);
        System.out.println(author01.id);
        author01.name = "Ivan";
        author01.id = 4;

        Author author02 = new Author(34);
        String info02 = author02.getInfo();
        author02.getInfo("author");

        Book book01 = new Book();
        book01.setName("JHohn");



    }
}
