package com.company;
import java.util.Scanner;

public class CWH_HW_01_PracticeSet1 {
    public static void main(String[] args) {
        //Question 1 Solution
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        System.out.println("Sum of " + a + "," + b + " and " + c + " is: " + sum );
        */

        //Question 2 Solution
        /*
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 +subject3)/30;
        System.out.println(cgpa);
         */

        //Question 3 Solution
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ",have a good day!");
         */

        //Question 4 Solution
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in KM: ");
        float measure = sc.nextFloat();
        float miles = measure * 0.62137f;
        System.out.println(measure + " KM = " + miles + " miles");
         */

        //Question 5 Solution
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
