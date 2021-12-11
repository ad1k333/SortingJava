package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DBManager implements Manager{

    @Override
    public ArrayList<Character> getDate() {
        ArrayList<Character> people = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            people = (ArrayList<Character>) inputStream.readObject();
            inputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return people;
    }

    @Override
    public void saveDate(ArrayList<Character> people) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"));
            objectOutputStream.writeObject(people);
            objectOutputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
