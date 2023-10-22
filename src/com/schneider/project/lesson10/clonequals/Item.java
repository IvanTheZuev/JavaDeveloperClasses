package com.schneider.project.lesson10.clonequals;

import java.util.Objects;

public class Item implements Cloneable{
    private final String name;
    private final double initialPrice;
    private double currentPrice;

    public Item(String name, double price) {
        this.name = name;
        this.initialPrice = price;
        this.currentPrice = price;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }



    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", initialPrice=" + initialPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {//при переопределении методов нельзя понижать тип Object
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(initialPrice, item.initialPrice) == 0 && Double.compare(currentPrice, item.currentPrice) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, initialPrice, currentPrice);
    }

    @Override
    public Item clone(){//если мы вызываем метод .clone() мы обязаны прописать implements Cloneable
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
}
