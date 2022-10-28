package main.java.homework.day8.List;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsList {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        StringBuilder printList = new StringBuilder();
        for (String i : cars) {
            printList.append("\"").append(i).append("\"").append("\n");
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        out.write(printList.substring(0, printList.length()));
        out.close();

        cars.removeIf(i -> i.length() > 4);

        for (String i : cars) {
            System.out.print(i + " ");
        }
    }

}

