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

        StringBuilder printList = new StringBuilder();
        for (String i : noodles) {
            printList.append(i).append("-");
        }
        System.out.print(printList.substring(0, printList.length()-1));

        System.out.println();

        for (int i = 0; i<noodles.size(); i++) {
            System.out.print(noodles.get(i).replace("a", "o") + " ");
        }


    }
}
