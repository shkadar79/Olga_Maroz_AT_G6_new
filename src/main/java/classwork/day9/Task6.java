package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(people.stream().min((p1, p2) -> p1.age - p2.age).get());
        System.out.println(people.stream().collect(Collectors.toMap(Object::hashCode, p -> p)));
        System.out.println(people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)));
        System.out.println(people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet());
        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
    }
}
