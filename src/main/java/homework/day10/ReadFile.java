package main.java.homework.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        List<String> list = new ArrayList<>();
        while (in.ready()) {
            String line = in.readLine();
            list.add(line);
        }
        in.close();
        Date date = new Date();
        System.out.println(list.stream().skip(4).filter(s -> s.startsWith("Date log:")).map(s -> s.substring(0, 20)).map(s -> s + " " + date)
                .collect(Collectors.joining("<br>", "", "")));

    }
}
