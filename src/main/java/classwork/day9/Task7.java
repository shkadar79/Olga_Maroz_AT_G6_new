package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
        System.out.println(list.stream().mapToInt(s -> s.length() % 2 != 0 ? s.length() : 0).sum());
        System.out.println(list.stream().collect(Collectors.joining("", "<p>", "</p>")));


    }
}
