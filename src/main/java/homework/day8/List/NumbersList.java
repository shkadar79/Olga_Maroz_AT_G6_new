package main.java.homework.day8.List;

import java.util.*;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));
        for (int i : numbers) {
            System.out.println(i);
        }

        int counter = 0;
        for (int i : numbers) {
            counter += i;
        }
        System.out.println(counter);

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}

