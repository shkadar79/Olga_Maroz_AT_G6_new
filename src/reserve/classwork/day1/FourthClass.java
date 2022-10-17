package reserve.classwork.day1;

import java.util.Random;

public class FourthClass {
    public void foo() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        System.out.println("Average value is: " + sum / 10);
    }

}

