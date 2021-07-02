package com.advance;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class CWH_HW_02_PracticeSet2 {
    public static void main(String[] args) {
        //Answer 1: We discussed the deprecated annotation in Annotations in Java tutorial. Below is the required program
        MyDeprecated d = new MyDeprecated();
        d.meth1();

        //Question 2: Suppress the warning generated in question number 2.
        @SuppressWarnings("deprecation")
        MyDeprecated d1 = new MyDeprecated();
        d1.meth1();

        //Question 3: Create an interface and generate an instance from it.
        MyInt i1 = () -> System.out.println("I am display");
        i1.display();

        //Question 4: Write a Java program to generate a multiplication table of a given number and write it to a file.
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
