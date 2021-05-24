package com.company;

import java.util.Locale;

public class CWH_HW_03_PracticeSet3 {
    public static void main(String[] args) {
        String name = "   Abhay Anand";

        //ANSWER 1
        System.out.println(name.toLowerCase());
        //ANSWER 2
        System.out.println(name.trim());

        String name2 = "Dear Abhay, Thanks a lot!";

        //ANSWER 3
        System.out.println(name2.replace("Abhay", "Anand"));

        //ANSWER 4
        String space = "This String has double  space and triple   space.";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //ANSWER 5
        String Letter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(Letter);


    }
}
