package main.java.homework.day6.stringTask;

public class WordDublicate {
    public void printWordDublicate(String incoming) {
        String[] splitIncoming = incoming.split(" ");
        for (int i = 0; i < splitIncoming.length; i++) {
            String newIncoming = splitIncoming[i];

            for (int j = i + 1; j < splitIncoming.length; j++) {
                if (newIncoming.equalsIgnoreCase(splitIncoming[j])) {
                    System.out.println(newIncoming + "");
                }


            }
        }
    }
}
