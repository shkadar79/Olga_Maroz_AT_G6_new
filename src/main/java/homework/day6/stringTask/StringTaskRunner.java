package main.java.homework.day6.stringTask;

import java.text.ParseException;

public class StringTaskRunner {
    public static void main(String[] args) throws ParseException {

        LettersFromLineToColumn task1 = new LettersFromLineToColumn();
        task1.printLettersToColumn("Мама мыла раму");
        WordDublicate task2 = new WordDublicate();
        task2.printWordDublicate("test is passed, test is failed");
        FindDigits task3 = new FindDigits();
        task3.printDigits("23 test is passed, 5 test is failed");
        CurrentDate task5 = new CurrentDate();
        task5.getDateAndTime();
        DateFormat task6 = new DateFormat();
        task6.printDateFormat("22.00 07.09.2020");
    }
}
