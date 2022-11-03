package main.java.homework.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Random randomAge = new Random();
        for (int i = 0; i < 100; i++) {
            people.add(new Person("Name" + i, "Surname" + i, 15 + randomAge.nextInt(15)));
        }
        System.out.println(people.stream().
                filter(s -> s.getAge() < 21).
                peek(s -> System.out.println(s.getName() + " " + s.getAge())).
                sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).
                limit(4).peek(s -> s.getName()).
                collect(Collectors.toList()));
    }
}
