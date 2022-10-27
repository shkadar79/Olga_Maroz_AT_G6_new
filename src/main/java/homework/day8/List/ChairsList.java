package main.java.homework.day8.List;

import main.java.homework.day8.Objects.Chair;

import java.util.*;

public class ChairsList {
    public static void main(String[] args) {
        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));
        int counter = 1;
        for (Chair i : furniture) {
            counter = i.getHeight() * i.getWidth();
            System.out.print(counter + " ");
        }
        Map<Integer, Chair> map = new HashMap<>();
        for (int i = 0; i< furniture.size(); i++){
            map.put(i, furniture.get(i));
        }
        for (int i : map.keySet()){
            System.out.println(i);
        }
        for (Chair i : map.values()){
            System.out.println(i);
        }
        for (Map.Entry<Integer, Chair> combo : map.entrySet()){
            System.out.println(combo);
        }
    }
}

