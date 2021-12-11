package com.company;

import java.io.Serializable;

public class Character extends Person implements Serializable  {
    private int age;
    private int height;
    private int weight;

    public Character(String name, String surname, String size, int age, int height, int weight) {
        super(name, surname, size);
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Character{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
