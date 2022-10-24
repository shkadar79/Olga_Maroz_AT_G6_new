package main.java.homework.day8.List;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        //TODO отпечатать в файл cars с новой строки в ковычках

        //TODO найти и удалить из набора авто, в названии которых больше 4 букв

        for (String i : cars) {
            System.out.print(i + " ");
        }
    }

}

