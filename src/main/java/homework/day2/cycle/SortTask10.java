package main.java.homework.day2.cycle;

import java.util.Random;

public class SortTask10 {

    public void printSortTask10() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
        }
        for (int n = 0; n < myArray.length; n++) {
            int max = n;
            for (int i = n; i < myArray.length; i++) {
                if (myArray[i] > myArray[max]) {
                    max = i;
                }
            }
            int x = myArray[n];
            myArray[n] = myArray[max];
            myArray[max] = x;
        }
        for (int j : myArray) {
            System.out.print(j + " ");
        }
    }
}













