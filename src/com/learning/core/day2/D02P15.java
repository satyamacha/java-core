package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            System.out.print("Enter " + N + " numbers separated by space: ");
            double[] numbers = new double[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextDouble();
            }

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            for (double num : numbers) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println("\nNumber of positive numbers: " + positiveCount);
            System.out.println("Number of negative numbers: " + negativeCount);
            System.out.println("Number of zeros: " + zeroCount);

            scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
