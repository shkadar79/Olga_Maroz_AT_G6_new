package main.java.classwork.day8;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] myArray = "мама мыла раму".split(" ");
        for (String i : myArray) {
            mySet.add(i);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String i : mySet){
            mySet.add(i);
        }

    }
}
