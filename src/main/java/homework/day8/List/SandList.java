package main.java.homework.day8.List;

import main.java.homework.day8.Objects.Sand;

import java.util.*;

public class SandList {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand i : sandbox) {
            System.out.print(i.getWeight() + " ");
        }
        System.out.println();
        for (Sand i : sandbox) {
            System.out.print(i.getName() + " ");
        }
        System.out.println();
        Map<Integer, Sand> sandboxMap = new HashMap<Integer, Sand>();
        for (int i = 0; i < sandbox.size(); i++) {
            sandboxMap.put(i, sandbox.get(i));
        }
        for (int i : sandboxMap.keySet()){
            System.out.println(i);
        }
        for (int i = 0; i < sandbox.size(); i++) {
            sandboxMap.put(i, sandbox.get(i));
        }
        for (Sand i : sandboxMap.values()){
            System.out.println(i);
        }
        for (Map.Entry<Integer, Sand> combo: sandboxMap.entrySet()){
            System.out.println(combo);
        }
    }
}

