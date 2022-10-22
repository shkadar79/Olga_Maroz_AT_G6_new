package main.java.homework.day6.stringTask;

public class FindDigits {
    public void printDigits(String incoming) {
        String[] splitIncoming = incoming.split("");
        int digit = 0;
        for (String i : splitIncoming) {

            if (i.matches(String.valueOf(0 - 9))) {
            }
            System.out.println(i);
        }
    }
}
