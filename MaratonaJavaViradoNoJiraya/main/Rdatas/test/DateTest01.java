package Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1688248372905L); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
