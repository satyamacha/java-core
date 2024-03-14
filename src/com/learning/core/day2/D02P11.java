package com.learning.core.day2;

import java.util.Scanner;

public class D02P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}