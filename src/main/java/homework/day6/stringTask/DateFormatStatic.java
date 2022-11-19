package main.java.homework.day6.stringTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatStatic {
    public static void printDateFormat(String incomingDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat formatterNew = new SimpleDateFormat("MMMM, d, yyyy HH:mm", new Locale("eng"));
        Date date = formatter.parse(incomingDate);

        System.out.println(formatterNew.format(date));
    }
}
