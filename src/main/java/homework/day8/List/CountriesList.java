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

        for (String i : countries) {
            System.out.print(i + ", ");
        }
        System.out.println();
        //TODO посчитать страны, в названии которых меньше 7 букв, вывести в корсоль число

        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + " ");
        }
    }
}
