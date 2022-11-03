package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        // сортировка по алфавиту
        System.out.println(list.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList()));
        // сортировка по алфавиту в обратном порядке
        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList()));
    }
}
