package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager manager = new DBManager();
        ArrayList<Character> people = manager.getDate();
        Character temp;
        int key=0;
        System.out.println("Insert how many people do you want to add?");
        int s = in.nextInt();
        for (int i=0;i<s;i++){
            System.out.println("Insert name");
            String name = in.next();
            System.out.println("Insert surname");
            String surname = in.next();
            System.out.println("Insert your clothes size:");
            String size = in.next();
            System.out.println("Insert Age:");
            int age = in.nextInt();
            System.out.println("Insert Height:");
            int height = in.nextInt();
            System.out.println("Insert weight: ");
            int weight = in.nextInt();
            people.add(new Character(name,surname,size,age,height,weight));
            manager.saveDate(people);
        }
        for (int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        while (true){
            System.out.println("""
                    PRESS [1] TO BUBBLE SORT
                    PRESS [2] TO INSERTION SORT
                    PRESS [3] TO SELECTION SORT
                    """);
            String choice = in.next();
            if (choice.equals("1")){
                System.out.println("""
                        PRESS[1] TO SORT HEIGHT
                        PRESS[2] TO SORT WEIGHT
                        PRESS[3] TO SORT NAME
                        PRESS[4] TO SORT SURNAME
                        PRESS[5] TO SORT AGE                
                        """);
                String choice1 = in.next();
                if (choice1.equals("1")){
                    long startTime = System.nanoTime();
                    for (int i=1;i< people.size();i++){
                        for (int r=0; r< people.size()-i;r++){
                            if(people.get(r).getHeight()<people.get(r+1).getHeight()){
                                temp = people.get(r);
                                people.set(r,people.get(r+1));
                                people.set(r+1,temp);
                            }
                        }
                    }
                    for (int i=0;i<people.size();i++){
                        System.out.println(people.get(i));
                    }
                    long endTime = System.nanoTime();
                    System.out.println("Time to sort: "+(endTime-startTime)+"ms");
                } else if(choice1.equals("2")){
                    long startTime = System.nanoTime();
                    for (int i=1;i< people.size();i++){
                        for (int r=0; r< people.size()-i;r++){
                            if(people.get(r).getWeight()<people.get(r+1).getWeight()){
                                temp = people.get(r);
                                people.set(r,people.get(r+1));
                                people.set(r+1,temp);
                            }
                        }
                    }
                    for (int i=0;i<people.size();i++){
                        System.out.println(people.get(i));
                    }

                    long endTime = System.nanoTime();
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("3")){
                    long startTime = System.nanoTime();
                    for (int i=1;i< people.size();i++){
                        for (int r=0; r< people.size()-i;r++){
                            if(people.get(r).getName().charAt(0)<people.get(r+1).getName().charAt(0)){
                                temp = people.get(r);
                                people.set(r,people.get(r+1));
                                people.set(r+1,temp);
                            }
                        }
                    }
                    for (int i=0;i<people.size();i++){
                        System.out.println(people.get(i));
                    }
                    long endTime = System.nanoTime();
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("4")){
                    long startTime = System.nanoTime();
                    for (int i=1;i< people.size();i++){
                        for (int r=0; r< people.size()-i;r++){
                            if(people.get(r).getSurname().charAt(0)<people.get(r+1).getSurname().charAt(0)){
                                temp = people.get(r);
                                people.set(r,people.get(r+1));
                                people.set(r+1,temp);
                            }
                        }
                    }
                    for (int i=0;i<people.size();i++){
                        System.out.println(people.get(i));
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("5")){
                    long startTime = System.nanoTime();
                    for (int i=1;i< people.size();i++){
                        for (int r=0; r< people.size()-i;r++){
                            if(people.get(r).getAge()<people.get(r+1).getAge()){
                                temp = people.get(r);
                                people.set(r,people.get(r+1));
                                people.set(r+1,temp);
                            }
                        }
                    }
                    for (int i=0;i<people.size();i++){
                        System.out.println(people.get(i));
                    }
                    long endTime = System.nanoTime();
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                }
            } else if (choice.equals("2")){
                System.out.println("""
                        PRESS[1] TO SORT HEIGHT
                        PRESS[2] TO SORT WEIGHT
                        PRESS[3] TO SORT NAME
                        PRESS[4] TO SORT SURNAME
                        PRESS[5] TO SORT AGE                
                        """);
                String choice1 = in.next();
                if (choice1.equals("1")){
                    long startTime = System.nanoTime();
                    for (int i=0;i<people.size()-1;i++){
                        key = i+1;
                        temp = people.get(key);
                        for (int j = i+1;j>0;j--){
                            if (temp.getHeight()<people.get(j-1).getHeight()){
                                people.set(j,people.get(j-1));
                                key = j-1;
                            }
                        }
                        people.set(key,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i=0;i< people.size();i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("2")){
                    long startTime = System.nanoTime();
                    for (int i=0;i<people.size()-1;i++){
                        key = i+1;
                        temp = people.get(key);
                        for (int j = i+1;j>0;j--){
                            if (temp.getWeight()<people.get(j-1).getWeight()){
                                people.set(j,people.get(j-1));
                                key = j-1;
                            }
                        }
                        people.set(key,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i=0;i< people.size();i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("3")){
                    long startTime = System.nanoTime();
                    for (int i=0;i<people.size()-1;i++){
                        key = i+1;
                        temp = people.get(key);
                        for (int j = i+1;j>0;j--){
                            if (temp.getName().charAt(0)<people.get(j-1).getName().charAt(0)){
                                people.set(j,people.get(j-1));
                                key = j-1;
                            }
                        }
                        people.set(key,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i=0;i< people.size();i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("4")){
                    long startTime = System.nanoTime();
                    for (int i=0;i<people.size()-1;i++){
                        key = i+1;
                        temp = people.get(key);
                        for (int j = i+1;j>0;j--){
                            if (temp.getSurname().charAt(0)<people.get(j-1).getSurname().charAt(0)){
                                people.set(j,people.get(j-1));
                                key = j-1;
                            }
                        }
                        people.set(key,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i=0;i< people.size();i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("5")){
                    long startTime = System.nanoTime();
                    for (int i=0;i<people.size()-1;i++){
                        key = i+1;
                        temp = people.get(key);
                        for (int j = i+1;j>0;j--){
                            if (temp.getAge()<people.get(j-1).getAge()){
                                people.set(j,people.get(j-1));
                                key = j-1;
                            }
                        }
                        people.set(key,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i=0;i< people.size();i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                }
            } else if (choice.equals("3")){
                System.out.println("""
                        PRESS[1] TO SORT HEIGHT
                        PRESS[2] TO SORT WEIGHT
                        PRESS[3] TO SORT NAME
                        PRESS[4] TO SORT SURNAME
                        PRESS[5] TO SORT AGE                
                        """);
                String choice1 = in.next();
                if (choice1.equals("1")){
                    long startTime = System.nanoTime();
                    for (int startIndex = 0; startIndex < people.size() - 1; ++startIndex)
                    {
                        int smallestIndex = startIndex;
                        for (int currentIndex = startIndex + 1; currentIndex < people.size(); ++currentIndex)
                        {
                            if (people.get(currentIndex).getHeight() < people.get(smallestIndex).getHeight()){
                                smallestIndex = currentIndex;
                            }
                        }
                        temp = people.get(smallestIndex);
                        people.set(smallestIndex,people.get(startIndex));
                        people.set(startIndex,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i = 0; i < people.size(); i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("2")){
                    long startTime = System.nanoTime();
                    for (int startIndex = 0; startIndex < people.size() - 1; ++startIndex)
                    {
                        int smallestIndex = startIndex;
                        for (int currentIndex = startIndex + 1; currentIndex < people.size(); ++currentIndex)
                        {
                            if (people.get(currentIndex).getWeight() < people.get(smallestIndex).getWeight()){
                                smallestIndex = currentIndex;
                            }
                        }
                        temp = people.get(smallestIndex);
                        people.set(smallestIndex,people.get(startIndex));
                        people.set(startIndex,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i = 0; i < people.size(); i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("3")){
                    long startTime = System.nanoTime();
                    for (int startIndex = 0; startIndex < people.size() - 1; ++startIndex)
                    {
                        int smallestIndex = startIndex;
                        for (int currentIndex = startIndex + 1; currentIndex < people.size(); ++currentIndex)
                        {
                            if (people.get(currentIndex).getName().charAt(0) < people.get(smallestIndex).getName().charAt(0)){
                                smallestIndex = currentIndex;
                            }
                        }
                        temp = people.get(smallestIndex);
                        people.set(smallestIndex,people.get(startIndex));
                        people.set(startIndex,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i = 0; i < people.size(); i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("4")){
                    long startTime = System.nanoTime();
                    for (int startIndex = 0; startIndex < people.size() - 1; ++startIndex)
                    {
                        int smallestIndex = startIndex;
                        for (int currentIndex = startIndex + 1; currentIndex < people.size(); ++currentIndex)
                        {
                            if (people.get(currentIndex).getSurname().charAt(0) < people.get(smallestIndex).getSurname().charAt(0)){
                                smallestIndex = currentIndex;
                            }
                        }
                        temp = people.get(smallestIndex);
                        people.set(smallestIndex,people.get(startIndex));
                        people.set(startIndex,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i = 0; i < people.size(); i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                } else if (choice1.equals("5")){
                    long startTime = System.nanoTime();
                    for (int startIndex = 0; startIndex < people.size() - 1; ++startIndex)
                    {
                        int smallestIndex = startIndex;
                        for (int currentIndex = startIndex + 1; currentIndex < people.size(); ++currentIndex)
                        {
                            if (people.get(currentIndex).getAge() < people.get(smallestIndex).getAge()){
                                smallestIndex = currentIndex;
                            }
                        }
                        temp = people.get(smallestIndex);
                        people.set(smallestIndex,people.get(startIndex));
                        people.set(startIndex,temp);
                    }
                    long endTime = System.nanoTime();
                    for (int i = 0; i < people.size(); i++){
                        System.out.println(people.get(i));
                    }
                    System.out.println("Time to sorting: "+(endTime-startTime)+"ms");
                }
            } else {
                System.out.println("Insert only 1-2-3");
                System.exit(0);
            }
        }
    }
}
