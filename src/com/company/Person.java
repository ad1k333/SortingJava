package com.company;

import java.io.Serializable;

public class Person  implements Serializable  {
    public String name;
    public String surname;
    public String size;

    public Person(String name, String surname, String size) {
        this.name = name;
        this.surname = surname;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
