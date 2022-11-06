package main.java.classwork.day11;

import main.java.homework.day2.base.TrainMehodsStringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Task1 {
    private static int sum;

    public static void main(String[] args) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                map.put(i, i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                map.forEach((k, v) -> sum += v);
            }
        });
        t1.start();
        t2.start();

    }
}
