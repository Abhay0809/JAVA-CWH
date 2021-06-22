package com.advance;

import java.time.*;

public class CWH_08_JavaTimeAPI {
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        System.out.println(cl.instant());

        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d2.isNegative());

        Duration d3 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d3.isZero());
        Duration d4 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d4.isZero());

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate ld1 = LocalDate.parse("2021-05-27");
        LocalDate ld2 = LocalDate.parse("2021-05-26");
        LocalDate ld3 = LocalDate.parse("2021-05-26");

        System.out.println(ld2.equals(ld1));
        System.out.println(ld3.equals(ld2));

        LocalDate ld4 = LocalDate.parse("2021-05-27");
        System.out.println(ld4.withYear(2001));

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t2 = LocalTime.of(13,18,29);
        System.out.println("Time before : "  + t2);

        LocalTime t1 = t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);

        LocalTime t3 = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + t3);

        LocalTime t4 = t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t4);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}
