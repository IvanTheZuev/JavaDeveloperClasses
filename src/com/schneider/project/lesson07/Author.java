package com.schneider.project.lesson07;

public class Author {
    // свойств, поля, атрибуты

    public long id;
    public String name;
    public int age;
    // public LocalDate data;

    public Author(long authorId) {
        id = authorId;
    }

    public Author(long authorId, String name) {
        this(authorId);
        this.name = name;
    }

    public String getInfo() {
        return "Автор; id = " + id + ", name " + name;
    }

    public void getInfo(String prefix) {
        if (prefix == null) return; // прерывает работу метода
        System.out.print(prefix + "Автор: id= " + id + ", name= " + name);


    }
}
