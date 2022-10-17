package reserve.homework.day2.cycle;

import java.util.Random;

public class Task3 {
    public static void printTask3() {

        Random random = new Random();
        int[] myArray = new int[7];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);

        }
        int a = myArray[0];
        int b = myArray[1];
        int c = myArray[2];
        int d = myArray[3];
        int e = myArray[4];
        int f = myArray[5];
        int g = myArray[6];
        System.out.print(g + " " + f + " " + e + " " + d + " " + c + " " + b + " " + a);
        System.out.println();
    }
}


