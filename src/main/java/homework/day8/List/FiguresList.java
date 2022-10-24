package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class FiguresList {
    public static void main(String[] args) {
        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        // TODO отпечатать слова в файл figures через тире
        for (String i : figures) {
            System.out.println(i);
        }
        // TODO посчитать сколько фигур НЕ содержит букву "и", вывести число в консоль


        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        figures.add(2, "Треугольниик");
        for (String i : figures) {
            System.out.print(i + " ");
        }
    }
}
