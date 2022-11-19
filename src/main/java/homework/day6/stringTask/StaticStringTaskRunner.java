package main.java.homework.day6.stringTask;

import java.text.ParseException;

public class StaticStringTaskRunner {
    public static void main(String[] args) throws ParseException {
        CurrentDateStatic.getDateAndTime();
        DateFormatStatic.printDateFormat("22.00 07.09.2020" );
        FindDigitStatic.printDigits("gfh76djs54 jhg88nvn");
        LettersToColumnStatic.printLettersToColumn("мама мыла раму");
        WordDublicateStatic.printWordDublicate("Мама мыла раму, мыла чисто");
    }
}
