package homework.day2.cycle;

import java.util.Random;

public class MultiplyByFiveTask6 {
    public void printMultiplyByFiveTask6() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
            myArray[i] *= 5;
        }
        for (int a : myArray)

            System.out.print(a + " ");
        System.out.println();
    }
}
