package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class CitiesList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        for (String i : cities) {
            System.out.println(i);
        }

        int counter = 0;
        for (String i : cities) {
            counter += i.length();
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }

}
