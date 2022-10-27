package main.java.homework.day8.List;

import java.util.ArrayList;
import java.util.List;

public class NoodlesList {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String i : noodles) {
            System.out.print(i + "-");
        }
        System.out.println();

        for (int i = 0; i<noodles.size(); i++) {
            System.out.print(noodles.get(i).replace("a", "o") + " ");
        }


    }
}
