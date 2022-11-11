package main.java.homework.day12;

import java.util.ArrayList;
import java.util.Collection;

public class ThreadTask2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(ThreadTask2::mouseList);
        Thread t2 = new Thread(ThreadTask2::mouseList);
        Thread t3 = new Thread(ThreadTask2::mouseList);
        Thread t4 = new Thread(ThreadTask2::mouseList);
        Thread t5 = new Thread(ThreadTask2::mouseList);
        Thread t6 = new Thread(ThreadTask2::mouseList);
        Thread t7 = new Thread(ThreadTask2::mouseList);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }

    public static void mouseList() {
        Collection<Mouse> mouse = new ArrayList<>();
        for (int i = 1; i < 19; i++) {
            mouse.add(new Mouse(i));
        }
        mouse.stream().
                filter(mouse1 -> Integer.parseInt(mouse1.getName().replaceAll("[^0-9]", "")) % 2 == 0).
                forEach(Mouse::peep);
    }

}
