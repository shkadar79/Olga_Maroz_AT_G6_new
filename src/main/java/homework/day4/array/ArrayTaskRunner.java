package main.java.homework.day4.array;

import java.util.Random;

public class ArrayTaskRunner {
    public static void main(String[] args) {
        ArrayTask task = new ArrayTask();
        task.sumElementArray(new int[]{3, 7, 9, 11, 13}, 5);
        System.out.println(task.returnArrayReverse(new int[]{3, 7, 9, 11, 13}, 5 ));
        System.out.println(task.returnSumArrayElements(new int[]{2, 5, 10, 15, 20}));
        task.printCow();

    }
}

