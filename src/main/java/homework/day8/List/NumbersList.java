package main.java.homework.day8.List;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        int counter = 0;
        for (int i : numbers) {
            counter += i;
        }
        System.out.println(counter);

        for (int i = 0; i < numbers.size(); i++) {
            Collections.sort(numbers);
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
