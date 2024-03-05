package com.learning.core.Day03;

import java.util.Scanner;

public class D03P01 {
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a string : ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        System.out.println("Length of given string is : " + length);

        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase format of given string is : " + uppercaseString);

        String palindromeResult = checkPalindrome(inputString)
                ? "Given String is a palindrome."
                : "Given String is not a palindrome.";
        System.out.println(palindromeResult);

        scanner.close();
    }

    private static boolean checkPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedStr);
    }
}
