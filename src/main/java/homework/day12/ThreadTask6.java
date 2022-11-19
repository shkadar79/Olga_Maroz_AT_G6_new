package main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ThreadTask6 {
    public static void main(String[] args) throws InterruptedException {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 1; i <= 420; i++) {
            mouse.add(new Mouse(i));
        }
        Thread t1 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t3 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t4 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t5 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t6 = new Thread(() -> {
            while (!mouse.isEmpty() && mouse.stream().anyMatch(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)) {
                Mouse m = mouse.stream()
                        .filter(mouse1 -> Integer.parseInt(mouse1.getName().replace("Mouse ", "")) % 2 == 0)
                        .collect(Collectors.toList()).stream().findFirst().get();
                m.peep();
                mouse.remove(m);
                try {
                    Thread.sleep(170);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        System.out.println(mouse.size());
    }
}

