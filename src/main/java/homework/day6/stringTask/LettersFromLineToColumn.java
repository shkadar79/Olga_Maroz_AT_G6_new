package main.java.homework.day6.stringTask;

public class LettersFromLineToColumn {
    public void printLettersToColumn(String incoming){
        String[] splitIncoming = incoming.split("");
        for (String i : splitIncoming){
            System.out.println(i);
        }
    }
}
