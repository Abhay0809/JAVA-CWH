package com.advance;

import java.util.Date;

public class CWH_05_DateClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());

        Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);

        Date d2= new Date(2021,12, 24);
        System.out.println(d2.compareTo(d));

        Date d3 = new Date(2021,5,23);

        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d3.getTime() );

        System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current year is : "+ d.getYear());

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
