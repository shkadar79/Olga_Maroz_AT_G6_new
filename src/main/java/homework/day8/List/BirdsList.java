package main.java.homework.day8.List;

import java.util.Arrays;
import java.util.List;

public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String i : birds) {
            System.out.print("--" + i);
        }
    }

}
