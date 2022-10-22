package main.java.homework.day6.stringTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public void getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy, HH часов mm минут");

        Date date = new Date(System.currentTimeMillis());
        System.out.println("сейчас на дворе: " + formatter.format(date));
    }
}
