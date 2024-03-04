package com.learning.core.Day02;

import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        long result = calculatePower(base, exponent);
        System.out.println(base + " power " + exponent + " is : "+  result);
    }
    
    public static long calculatePower(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Exponent cannot be negative for this implementation.");
            return -1;
        }
        
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}