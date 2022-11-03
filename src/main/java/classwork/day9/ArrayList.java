package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        list.stream().filter("мама"::equals).count();


        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));


    }
}