package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {12, 3, 4, 5};

            int number = numbers[5];

        } catch (Exception e) {
            e.printStackTrace();
        } finally {                         // this code in finally is always executed even if there is an exception/or if
            System.out.println("Before Scanner close");   // there is no exception
            if(scanner!=null) {                 // we want to make sure that all the objects that are created are closed
            scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
