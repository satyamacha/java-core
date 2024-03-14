package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number is : " + reversedNumber);
        scanner.close();
    }
    
    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}