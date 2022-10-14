package homework.day2.cycle;

import java.util.Random;

public class ReverseTask5 {
    public void printReverseTask5() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);

        }
        int x = myArray.length - 1;
        for (int i = x; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}

