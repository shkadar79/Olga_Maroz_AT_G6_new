package main.java.homework.day6.stringTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public void printDateFormat(String incomingDate) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM, dd, yyyy HH:mm");
        System.out.println(formatter.format(date));
    }
}
