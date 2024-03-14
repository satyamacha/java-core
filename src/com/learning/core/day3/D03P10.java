package com.learning.core.day3;


import java.util.Scanner;
public class D03P10 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        
        int longestPrefixSuffixLength = findLongestPrefixSuffixLength(s);
        System.out.println("Length of the longest prefix which is also a suffix: " + longestPrefixSuffixLength);
        scanner.close();
	}
    
    public static int findLongestPrefixSuffixLength(String s) {
        int n = s.length();
        for (int len = n - 1; len > 0; len--) {
            if (s.substring(0, len).equals(s.substring(n - len))) {
                return len;
            }
        }
        return 0;
    }
}