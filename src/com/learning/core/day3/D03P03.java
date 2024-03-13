package com.learning.core.Day03;


import java.util.Scanner;

public class D03P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[18];

        System.out.print("Enter 15 integers separated by space: ");
        for (int i = 0; i < 15; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
                }
            array[i] = scanner.nextInt();
        }

        
        for (int i = 15; i < 18; i++) {
            array[i] = 0;
        }

        
        array[15] = calculateSum(array, 0, 14);


        array[16] = calculateAverage(array, 0, 14);


        array[17] = findSmallestValue(array);



        System.out.println("Modified array: " + java.util.Arrays.toString(array));

        scanner.close();
    }


    private static int calculateSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }


    private static int calculateAverage(int[] array, int start, int end) {
        int sum = calculateSum(array, start, end);

        return (int) Math.ceil((double) sum / (end - start + 1));
    }


    private static int findSmallestValue(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0 && array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
