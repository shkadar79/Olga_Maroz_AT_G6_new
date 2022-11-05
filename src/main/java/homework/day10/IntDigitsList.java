package main.java.homework.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class IntDigitsList {
    public static void main(String[] args) {

        int minValue = 1;
        int maxValue = 30;
        List<Integer> intDigitsList = new ArrayList<>();

        for (int n = minValue; n <= maxValue; n++) {
            intDigitsList.add(n);
        }
        System.out.println(intDigitsList.stream().anyMatch(i -> i % 3 == 0 && i % 5 == 0));
       // for check:
        // System.out.println(intDigitsList.stream().filter(i -> i % 3 == 0 && i % 5 == 0).collect(Collectors.toList()));
    }
}