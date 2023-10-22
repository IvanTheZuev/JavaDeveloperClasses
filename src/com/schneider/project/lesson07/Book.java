package com.schneider.project.lesson07;

public class Book {
    private String name;
    private boolean isPublished;
    private Author author;

    public  void setName(String name){
        //if (name == null) return;
        if (name == null){
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }
    public Book(String name){
        setName(name);
    }

    public Book(boolean isPublished) {
        this.isPublished = isPublished;
    }
    public String getName(){ //Getter
        return name;
    }

    //Задание #1
    //Дописать реализацию конструктора public Book(String name, int numberOfAuthors) класса Book:
    //Значение numberOfAuthors должно находится в диапазоне [1, 5).
    //В конструкторе необходимо инициализировать свойство authors массивом на numberOfAuthors элементов.
    //Массив должен быть заполнен значениями по умолчанию.

    public Book(String name, int numberOfAuthors){
        int[] authors = new int[]{numberOfAuthors};
        for (int i = 0; i < authors.length; i++) {
            if(i >= 1 && i < 5) {
                authors[i] = numberOfAuthors;
            }
        }
    }

    //Задание #2
    //
    //Реализовать добавление нового автора в массив authors в методе public void addAddAuthor(Author author) класса Book:
    //Значение author не может быть null ссылкой.
    //Новый автор не должен перезаписывать уже существующего в массиве.
    //Вызов метода не должен приводить к ошибке выхода за пределы массива.
    //В массиве не может быть нескольких ссылок на один объект.

    public  void addAuthor(Author author){
        if(author != null){

        }
    }


}
