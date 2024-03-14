package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any three integers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is : " + max);
    }
    
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
}