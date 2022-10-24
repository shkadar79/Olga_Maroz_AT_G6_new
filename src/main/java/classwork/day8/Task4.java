package main.java.classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        for (int i = 0; i < 100000; i++) {
            myList1.add("мама мыла раму" + i);
        }

        for (int i = 0; i < 10000; i++) {
            myList2.add("папа мыл раму" + i);
        }

        long t0 = System.currentTimeMillis();

        Iterator<String> iterator = myList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        Iterator<String> iterator1 = myList2.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
        }

        System.out.println(System.currentTimeMillis() - t0);

    }
}
