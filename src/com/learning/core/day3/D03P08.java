package com.learning.core.day3;


import java.util.Scanner;
public class D03P08 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int deletions = minDeletionsToPalindrome(input);
        System.out.println("Minimum deletions to make the string a palindrome: " + deletions);
    }

    public static int minDeletionsToPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; 
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && len == 2) {
                    dp[i][j] = 2; 
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2; 
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]); 
                }
            }
        }
        return n - dp[0][n - 1];
    }
}