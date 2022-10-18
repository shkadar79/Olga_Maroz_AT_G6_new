package main.java.homework.day2.cycle;

import java.util.Random;

public class FirstLastElementTask9 {
    public void printFirstLastElementTask9() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");

        }
        System.out.println();
        int first = myArray[0];
        int last = myArray[myArray.length - 1];
        myArray[0] = last;
        myArray[myArray.length - 1] = first;
        for (int a : myArray) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
