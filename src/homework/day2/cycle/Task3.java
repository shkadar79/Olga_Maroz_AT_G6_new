package homework.day2.cycle;

import java.util.Random;

public class Task3 {
    public void createArrayTask3() {

        Random random = new Random();
        int[] myArray = new int[7];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println(myArray[i]);
        }
    }
}


