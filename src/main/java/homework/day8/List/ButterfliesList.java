package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesList {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        for (String i : butterflies) {
            System.out.println("\"" + i + "\"");
        }
        // TODO посчитать сколько бабочек содержит букву "о", вывести число в консоль



        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println("\n");
        for (String i : butterflies) {
            System.out.println(i);
        }
    }
}
