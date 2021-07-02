package com.advance;

@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class CWH_12_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
            NewPhone phone = new NewPhone();
            phone.showTime();
            phone.sum(5, 6);
        }
    }
