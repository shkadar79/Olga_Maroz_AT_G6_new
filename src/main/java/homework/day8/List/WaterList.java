package main.java.homework.day8.List;

import main.java.homework.day8.Objects.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WaterList {
    public static void main(String[] args) {
        List<Water> water = new ArrayList<>(Arrays.asList(new Water("прозрачная", "нет"), new Water("прозрачная", "нет"), new Water("мутная", "аммиачный")));
        for (Water i : water) {
            System.out.println(i.getColor() + "-" + i.getSmell());
        }
    }
}
