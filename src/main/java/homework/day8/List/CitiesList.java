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
        //TODO посчитать сумму всех буквво всех словах и вывести в консоль
        for (String i : cities) {
            System.out.println(i.length());
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }

}
