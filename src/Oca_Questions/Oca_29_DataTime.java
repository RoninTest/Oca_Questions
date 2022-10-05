package Oca_Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Oca_29_DataTime {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.of(2015,5,10,9,22,33);

        Period p=Period.of(3,0,2); // 3 year 2 month
        System.out.println(p);
        d=d.minus(p); // Now date.
        DateTimeFormatter f=DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm");
        System.out.println(f.format(d));
    }
}
