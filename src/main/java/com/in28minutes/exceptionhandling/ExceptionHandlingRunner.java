package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner
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
        String str = null;
        str.length();
        System.out.println("Metohd 4 ended");
    }
}
