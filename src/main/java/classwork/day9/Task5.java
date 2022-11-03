package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        String maxS = list.stream().flatMap(s -> Arrays.stream(s.split(""))).
                peek(System.out::println).max(String::compareTo).get();
        System.out.println(maxS);
    }
}
