package homework.day4.array;

import java.util.Random;

public class ArrayTask1 {
    public void ArraySum(int[] myArray) {
        int sum = 0;
        for (int a : myArray) {
            sum += a;}
                System.out.println(sum);

    }
    public int[] getArray(int n) {
        Random random = new Random();
        int[] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        return myArray;
    }


}
