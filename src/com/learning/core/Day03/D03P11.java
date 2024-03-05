package com.learning.core.Day03;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the pattern
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        // Input the number of strings in the dictionary
        System.out.print("Enter the number of strings in the dictionary: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the strings in the dictionary
        List<String> dictionary = new ArrayList<>();
        System.out.println("Enter the strings in the dictionary:");
        for (int i = 0; i < n; i++) {
            dictionary.add(scanner.nextLine());
        }

        // Find strings that match the pattern
        List<String> matchedStrings = findMatchingStrings(dictionary, pattern);

        // Output matched strings
        System.out.println("Strings matching the pattern:");
        for (String str : matchedStrings) {
            System.out.println(str);
        }

        scanner.close();
    }

    public static List<String> findMatchingStrings(List<String> dictionary, String pattern) {
        List<String> matchedStrings = new ArrayList<>();
        for (String str : dictionary) {
            if (str.startsWith(pattern)) {
                matchedStrings.add(str);
            }
        }
        return matchedStrings;
    }
}