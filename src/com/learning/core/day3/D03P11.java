package com.learning.core.day3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D03P11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter the number of strings in the dictionary: ");
        int n = scanner.nextInt();

        List<String> dictionary = new ArrayList<>();
        System.out.println("Enter the strings in the dictionary:");
        for (int i = 0; i < n; i++) {
            dictionary.add(scanner.nextLine());
        }

        List<String> matchedStrings = findMatchingStrings(dictionary, pattern);

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