package com.learning.core.Day02;

import java.util.Scanner;

public class D02P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + n + "-th number:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            int a = 0;
            int b = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }
}