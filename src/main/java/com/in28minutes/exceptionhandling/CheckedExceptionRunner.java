package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {
    public static void main(String[] args) {
        try {
            someOtherMethod();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        someOtherMethod2();
    }
    private static void someOtherMethod2() throws RuntimeException {   // exception that is runtime exception, and
                                                                       // is called unchecked exception (it is not checked
    }                                                                  // at the compile-time, but it is checked at runtime).
                                                                       // these are all RuntimeException and subclasses of it

    private static void someOtherMethod() throws InterruptedException {  // checked exception meaning it is checked at the
        Thread.sleep(2000);                                         // compile time, and the calling method needs either to
    }                                                                     // handle it with try and catch or to throw it.
}                                                                         // These are all which are not RuntimeException and
                                                                          // subclasses of it (for ex.: IOException, SQLException
                                                                          // etc.)