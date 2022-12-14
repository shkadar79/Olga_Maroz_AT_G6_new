package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class CountriesList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        StringBuilder printList = new StringBuilder();
        for (String i : countries) {
            printList.append(i).append(", ");
        }
        System.out.print(printList.substring(0, printList.length()-2));

        System.out.println();

        int counter = 0;
        for (String i : countries) {
            if (i.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
