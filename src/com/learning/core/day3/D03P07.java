package com.learning.core.Day03;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class D03P07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        List<String> subsequences = generateSubsequences(input);
        
        System.out.println("Subsequences of '" + input + "' in order:");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    
    public static List<String> generateSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        int n = str.length();
        
        for (int length = 1; length <= n; length++) {
            generateSubsequencesHelper(str, 0, "", length, subsequences);
        }
        
        return subsequences;
    }
    
    public static void generateSubsequencesHelper(String str, int index, String current, int length, List<String> subsequences) {
        if (length == 0) {
            subsequences.add(current);
            return;
        }
        
        if (index == str.length()) {
            return;
        }
        
        generateSubsequencesHelper(str, index + 1, current + str.charAt(index), length - 1, subsequences);
        
        generateSubsequencesHelper(str, index + 1, current, length, subsequences);
    }
}