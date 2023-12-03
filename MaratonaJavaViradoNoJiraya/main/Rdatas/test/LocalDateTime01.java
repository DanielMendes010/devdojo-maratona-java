package Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime01 {
    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, 7, 5);
        LocalTime time = LocalTime.of(5, 24, 0);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        date = LocalDate.parse("2022-07-05");
        time = LocalTime.parse("05:24:00");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
