package com.company;

public class CWH_07_StringMethod {
    public static void main(String[] args) {
        String name = "Abhay";
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     Abhay     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('a', 'p'));
        //System.out.println(name.replace("a", "ier"));

        //System.out.println(name.startsWith("Abh"));
        //System.out.println(name.endsWith("d"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "Abhayayay";
        //System.out.println(modifiedName.indexOf("ay"));
        //System.out.println(modifiedName.indexOf("ay", 4));
        //System.out.println(modifiedName.lastIndexOf("ay", 7));

        //System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("AbhAY"));

        System.out.println("I am escape sequence\tdouble quote");

    }
}
