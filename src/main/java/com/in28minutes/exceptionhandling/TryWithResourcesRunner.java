package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {

            try (Scanner  scanner = new Scanner(System.in)) {   // in try with resources there is no need for scanner.close(),
                                                                // because every object created it will be closed at the end
                int[] numbers = {12, 3, 4, 5};                  // of the execution

                int number = numbers[5];

            } catch (Exception e) {
               e.printStackTrace();
            } finally {
                System.out.println("After Scanner close");
            }
        System.out.println("Just before closing out main");
    }
}
