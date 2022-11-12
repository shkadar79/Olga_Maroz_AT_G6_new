package main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ThreadTask4 {
    private static Collection<Mouse> mouse = new ArrayList<>();

    public static void main(String[] args) {
        Object lock = new Object();
        for (int i = 1; i <= 280; i++) {
            mouse.add(new Mouse(i));
        }
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                mousePeepAndDelete();
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                mousePeepAndDelete();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                mousePeepAndDelete();
            }
        });
        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                mousePeepAndDelete();
            }
        });
        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                mousePeepAndDelete();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void mousePeepAndDelete() {
        while (!mouse.isEmpty()) {
            Mouse m = mouse.stream().findAny().get();
            m.peep();
            mouse.remove(m);
        }
        try {
            Thread.sleep(300);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



