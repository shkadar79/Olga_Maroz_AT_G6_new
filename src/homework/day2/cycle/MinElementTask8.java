package homework.day2.cycle;

import java.util.Random;

public class MinElementTask8 {

    public void printMinElementTask8() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.print(myArray[i] + " ");

        }
        System.out.println();
        int min = myArray[0];
        for (int a : myArray) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println(min);

    }

}

