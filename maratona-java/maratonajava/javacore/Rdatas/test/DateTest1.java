package maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        Date date = new Date(); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
