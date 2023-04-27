package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2
{
    public static void main( String[] args ) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method 1 ended");
    }

    private static void method2() {
        method3();
        System.out.println("Method 2 ended");
    }

    private static void method3() {
        method4();
        System.out.println("Method 3 ended");
    }

    private static void method4() {
        try {
            String str = null;       // if any of the code in here throws an exception (and it does, a NullPointerException -
            str.length();            // - because we operate on a null object)
            System.out.println("Method 4 ended");
        } catch (Exception ex) {               // it will be caught and it would be handled in here
            //System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
