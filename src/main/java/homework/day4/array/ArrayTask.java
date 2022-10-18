package main.java.homework.day4.array;

import java.time.LocalDate;

public class ArrayTask {
    public void sumElementArray(int[] array, int n) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println(sum);
    }

    public int[] returnArrayReverse(int[] array, int n) {
        int newArrayLength = 0;
        for (int i : array) {
            if (i > n) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int newArrayElement = newArrayLength - 1;
        for (int i : array) {
            if (i > n) {
                newArray[newArrayElement] = i;
                newArrayElement--;
            }
        }
        return newArray;
    }

    public int returnSumArrayElements(int[] array) {
        int sum = 0;
        LocalDate date = LocalDate.now();
        for (int i : array) {
            if (i % date.getMonthValue() == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void printCow(){
        System.out.println("\t  ^__^\n");
        System.out.println("\t  (oo)\\\\______\n");
        System.out.println("\t  (__)\\ ) \\/\\ \\\n");
        System.out.println("\t     ||----w |\\\n");
        System.out.println("\t     ||   ||\n");
    }
}
