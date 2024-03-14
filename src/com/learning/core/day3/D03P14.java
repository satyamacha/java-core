package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class D03P14 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first sorted array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of the second sorted array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        findUnionIntersection(arr1, arr2);
    }
    
    public static void findUnionIntersection(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            union.add(arr1[i]);
            i++;
        }
        
        while (j < arr2.length) {
            union.add(arr2[j]);
            j++;
        }
        
        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nIntersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}