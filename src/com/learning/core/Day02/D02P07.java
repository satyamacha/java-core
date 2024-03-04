package com.learning.core.Day02;

import java.util.Scanner;

public class D02P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the percentage of marks obtained: ");
        double percentage = scanner.nextDouble();
        
        String grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
    }
    
    public static String calculateGrade(double percentage) {
        if (percentage >= 60) {
            return "A grade";
        } else if (percentage >= 45) {
            return "B grade";
        } else if (percentage >= 35) {
            return "C grade";
        } else {
            return "Fail";
        }
    }
}