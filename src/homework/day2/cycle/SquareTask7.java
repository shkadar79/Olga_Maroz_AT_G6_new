package homework.day2.cycle;

import java.util.Random;

public class SquareTask7 {
    public void printSquareTask7() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
            myArray[i] *= myArray[i];
        }
        for (int a : myArray) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}


