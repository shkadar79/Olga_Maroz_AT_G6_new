package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublesList {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double i : doubles) {
            System.out.print(i + " ");
        }
        System.out.println();

        double counter = 1;
        for (double i : doubles) {
            counter *= i;
        }
        System.out.println(counter);

        double sum = 0;
        for (double i : doubles) {
            double j = i % 1;
            sum += j;
        }
        System.out.println(sum);

        for (int i=0; i< doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}
