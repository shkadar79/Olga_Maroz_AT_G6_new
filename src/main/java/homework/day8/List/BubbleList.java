package main.java.homework.day8.List;

import main.java.homework.day8.Objects.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleList {
    public static void main(String[] args) {
        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));
        for (Bubble i : bubbles) {
            System.out.print(i.getVolume() + " ");
        }
        System.out.println();

        for (Bubble i : bubbles) {
            System.out.print(i.getName() + " ");
        }
        System.out.println();

        int counterVolume = 0;
        for (Bubble i : bubbles) {
            counterVolume += i.getVolume();
        }
        System.out.println(counterVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
