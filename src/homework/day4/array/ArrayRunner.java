package homework.day4.array;

import homework.day4.array.ArrayTask1;
import homework.day4.array.ArrayTask2;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        ArrayTask1 task1 = new ArrayTask1();
        System.out.println(Arrays.toString(task1.getArray(5)));
        task1.ArraySum(task1.getArray(5));

        ArrayTask2 task2 = new ArrayTask2();
        task2.testArray();

        ArrayTask3 task3 = new ArrayTask3();
        System.out.println(Arrays.toString(task3.getArray(5)));
        task3.arraySumDevisibleByTen(task3.getArray(5));
    }
}