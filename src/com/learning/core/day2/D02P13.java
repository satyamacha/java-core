package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    
    scanner.close();
    }
    
    public static long calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}