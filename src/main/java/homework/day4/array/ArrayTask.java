package main.java.homework.day4.array;

public class ArrayTask {
    public void sumElementArray(int[] array, int n) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        System.out.println(sum);
    }

    public int[] returnArrayReverse(int[] array, int n) {
        int newArrayLength = 0;
        for (int i : array) {
            if (i > n) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int newArrayElement = newArrayLength - 1;
        for (int i : array) {
            if (i > n) {
                newArray[newArrayElement]=i;
                newArrayElement--;
            }
        }
        return newArray;
    }
}
