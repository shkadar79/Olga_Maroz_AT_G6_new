package main.java.homework.day2.cycle;

import java.util.Random;

public class Task6 {
    public static void printTask6() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);

        }
        int a = myArray[0];
        int b = myArray[1];
        int c = myArray[2];
        int d = myArray[3];
        int e = myArray[4];

        System.out.print(e + " " + b + " " + c + " " + d + " " + a);
        System.out.println();
    }
}


