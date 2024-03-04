package com.learning.core.Day02;

import java.util.Scanner;

public class D02P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two numbers and a mathematical operator from (+, -, *, /): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        
        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
    
    public static double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                System.exit(0);
        }
        return result;
    }
}