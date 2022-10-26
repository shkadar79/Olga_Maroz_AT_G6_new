package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));
        for (String i : birds) {
            System.out.println("--" + i + "--");
        }

        int count = 0;
        for (String i : birds) {
            String[] b = i.split("");
            int counter = 0;
            for (int j = 0; j < i.length(); j++) {
                if (b[j].toLowerCase().matches("[аеёиоуыэюя]")) {
                    counter++;
                }
            }
            if (counter > 1) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println();
        birds.set(2, "Синица");
        for (String i : birds) {
            System.out.print(i + " ");
        }
    }
}




