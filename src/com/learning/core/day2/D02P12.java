package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Loop to iterate through each row
        for (int i = rows; i >= 1; i--) {
            // Loop to print spaces before stars
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Loop to print stars in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}