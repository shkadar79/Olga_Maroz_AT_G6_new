package main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class ThreadTask1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> mouseList());
        Thread t2 = new Thread(ThreadTask1::mouseList);
        Thread t3 = new Thread(ThreadTask1::mouseList);
        Thread t4 = new Thread(ThreadTask1::mouseList);
        Thread t5 = new Thread(ThreadTask1::mouseList);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void mouseList() {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.forEach(Mouse::peep);

    }

}



