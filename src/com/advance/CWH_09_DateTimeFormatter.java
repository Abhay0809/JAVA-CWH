package com.advance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_09_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formatting : "+ myDate);

        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

        String myDate1 = dt.format(df1); // Creating date string using date and format
        System.out.println("Date in ISO format : "+ myDate1);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_WEEK_DATE;//

        String myDate2 = dt.format(df2);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_ORDINAL_DATE;//

        String myDate3 = dt.format(df3);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate3);

        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df5 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate4 = dt.format(df4); // Creating date string using date and format
        System.out.println(myDate4);

    }
}
