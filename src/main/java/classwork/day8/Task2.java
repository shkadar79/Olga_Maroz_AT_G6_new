package main.java.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            myList1.add("мама мыла раму" + i);
        }

        for (int i = 0; i < 10000; i++) {
            myList2.add("папа мыл раму" + i);
        }
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < myList2.size(); i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

    }
}
