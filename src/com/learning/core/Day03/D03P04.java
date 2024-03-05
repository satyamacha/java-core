package com.learning.core.Day03;


import java.util.Scanner;

public class D03P04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int index = findFirstRepeatingElementIndex(arr);
        if (index == -1) {
            System.out.println("No repeating elements found.");
        } else {
            System.out.println("Index of the first repeating element: " + index);
        }
    }
    
    public static int findFirstRepeatingElementIndex(int[] arr) {
        int[] visited = new int[100001]; // Assuming elements are within this range
        int minIndex = -1; // Initialize with -1 as no repeating element found yet
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (visited[arr[i]] != 0) {
                minIndex = visited[arr[i]] - 1;
            } else {
                visited[arr[i]] = i + 1; // Store index + 1 to distinguish from default value 0
            }
        }
        
        return minIndex;
    }
}