package main.java.homework.day6.stringTask;

public class FindDigitStatic {
    public static void printDigits(String incoming) {
        String[] splitIncoming = incoming.split("\\D+");
        int[] newArray = new int[splitIncoming.length];

        for (int i = 0; i < splitIncoming.length; i++) {
            if (!splitIncoming[i].equalsIgnoreCase("")) {
                newArray[i] = Integer.valueOf(splitIncoming[i]);
                System.out.println(newArray[i]);
            }

        }
    }
}
