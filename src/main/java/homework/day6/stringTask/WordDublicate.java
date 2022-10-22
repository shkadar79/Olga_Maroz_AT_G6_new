package main.java.homework.day6.stringTask;

public class WordDublicate {
    public void printWordDublicate(String incoming) {
        String[] splitIncoming = incoming.split("");
        for (int i = 0; i < splitIncoming.length; i++) {
            String newIncoming = splitIncoming[i];
            Boolean x = false;

            for (int j = i + 1; j < splitIncoming.length; j++) {
                if (newIncoming.equalsIgnoreCase(splitIncoming[i])) {
                    splitIncoming[i] = "";
                    x = true;
                }

                System.out.println(newIncoming + "");
            }
        }
    }
}
