package com.learning.core.day9;
import java.util.Scanner;
public class D09P03 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = linearSearch(array, target);

        if (found) {
            System.out.println("Output: present");
        } else {
            System.out.println("Output: not present");
        }

        scanner.close();
    }

    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}