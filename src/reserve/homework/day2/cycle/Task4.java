package reserve.homework.day2.cycle;

import java.util.Random;

public class Task4 {
    public static void printTask4() {

        Random random = new Random();
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);

        }
        int a = myArray[0] * 5;
        int b = myArray[1] * 5;
        int c = myArray[2] * 5;
        int d = myArray[3] * 5;
        int e = myArray[4] * 5;

        System.out.print(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println();
    }
}
