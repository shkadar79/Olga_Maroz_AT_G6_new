package homework.day2.cycle;

import java.util.Random;

public class Task4 {
    public void printArrayTask4() {

        Random random = new Random();
        int[] myArray = new int[7];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        for (int a : myArray) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}


