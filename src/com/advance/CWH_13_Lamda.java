package com.advance;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

@FunctionalInterface
interface LambaExp{
    void meth1(int a, int b);
}


//
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}

public class CWH_13_Lamda {
    public static void main(String[] args) {
        //        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions

//        DemoAno obj = new HarryFunc();
//        obj.meth1();
        DemoAno obj = (a)->{System.out.println("I am method 1 from this lambda " + a);};
        obj.meth1(6);

        LambaExp obj2 =(a,b)->{
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj2.meth1(5,10);
    }
}
