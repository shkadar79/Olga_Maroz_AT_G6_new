package main.java.homework.day6.stringTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public void printDateFormat(String incomingDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat formatterNew = new SimpleDateFormat("MMMM, dd, yyyy HH:mm");
        Date date = formatter.parse(incomingDate);

        System.out.println(formatterNew.format(date));
    }
}
