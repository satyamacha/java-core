package com.learning.core.day3;


import java.util.Scanner;
public class D03P12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        if (canSplitIntoFourDistinctStrings(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean canSplitIntoFourDistinctStrings(String input) {
        if (input.length() < 4) {
            return false;
        }
        
        for (int i = 1; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                for (int k = j + 1; k < input.length(); k++) {
                    String first = input.substring(0, i);
                    String second = input.substring(i, j);
                    String third = input.substring(j, k);
                    String fourth = input.substring(k);
                    
                    if (areDistinct(first, second, third, fourth)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static boolean areDistinct(String first, String second, String third, String fourth) {
        return !first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
               !second.equals(third) && !second.equals(fourth) &&
               !third.equals(fourth);
    }
}