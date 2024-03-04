package com.learning.core.Day02;

import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        try {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Take input N
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            // Take N numbers as input
            System.out.print("Enter " + N + " numbers separated by space: ");
            double[] numbers = new double[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextDouble();
            }

            // Initialize counters
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            // Count positive, negative, and zero numbers
            for (double num : numbers) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            // Display results
            System.out.println("\nNumber of positive numbers: " + positiveCount);
            System.out.println("Number of negative numbers: " + negativeCount);
            System.out.println("Number of zeros: " + zeroCount);

            // Close the scanner
            scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
