package main.java.homework.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LengthValue {
    public static void main(String[] args) {
        List<Integer> lengthValue = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                lengthValue.add(i);
            }
        }
        System.out.println(lengthValue.stream().peek(s -> System.out.println(s.intValue())).
                mapToDouble(s -> s % 2.54).sum());
    }

}
