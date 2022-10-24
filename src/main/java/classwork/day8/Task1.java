package main.java.classwork.day8;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        String[] myList = "мама мыла раму".split(" ");
        for (String i : myList) {
            words.add(i);
        }
        for (String i : words) {
            System.out.println(i);
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}

