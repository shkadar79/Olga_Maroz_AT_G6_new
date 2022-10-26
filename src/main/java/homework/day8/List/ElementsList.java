package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class ElementsList {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String i : elements) {
            System.out.print(i + " ");
        }
        System.out.println();

        int counter = 0;
        for (String i : elements) {
            if (i.contains("-") || i.contains(" ")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();
        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");
        for (String i : elements) {
            System.out.print(i + " ");
        }
    }
}
