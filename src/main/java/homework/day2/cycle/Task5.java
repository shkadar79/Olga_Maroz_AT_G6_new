package main.java.homework.day2.cycle;

import java.util.Random;

public class Task5 {
    public static void printTask5() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);

        }
        int a = myArray[0] * myArray[0];
        int b = myArray[1] * myArray[1];
        int c = myArray[2] * myArray[2];
        int d = myArray[3] * myArray[3];
        int e = myArray[4] * myArray[4];

        System.out.print(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println();
    }
}


