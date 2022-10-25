package main.java.homework.day8.List;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresList {
    public static void main(String[] args) throws IOException {
       List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        StringBuilder printList = new StringBuilder();
        for (String i : figures) {
            printList.append(i).append("-");
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("figure.txt"));
        out.write(printList.substring(0, printList.length()));
        out.close();

        int counter = 0;
        for (String i : figures) {
            if (!i.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        figures.add(2,"Треугольник");
        for (String i : figures) {
            System.out.print(i + " ");
        }
    }
}
