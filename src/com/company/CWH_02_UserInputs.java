package com.company;
import java.util.Scanner;

public class CWH_02_UserInputs { // shift+enter to go new line
    public static void main(String[] args) { //main for shortcut
        System.out.println("Taking Input From the User"); //sout for shortcut
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
