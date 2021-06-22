package com.advance;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH_07_GregoryCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2000));
        System.out.println(gc.isLeapYear(2021));

        System.out.println("Date before rolling : " + gc.getTime());

        gc.roll(Calendar.MONTH, true);
        gc.roll(Calendar.DATE, false);
        gc.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + gc.getTime());

        System.out.println("Calendar : " + gc.getTime());
        System.out.println("The hashcode for this calendar is : "+ gc.hashCode());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
