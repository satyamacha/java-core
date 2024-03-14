package com.learning.core.day3;


import java.util.Scanner;
public class D03P06 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the number of vowels to count from the end: ");
        int n = scanner.nextInt();
        
        String lastNVowels = getLastNVowels(input, n);
        
        if (lastNVowels == null) {
            System.out.println("Mismatch in Vowel count");
        } else {
            System.out.println("Last " + n + " vowels from the end: " + lastNVowels);
        }
    }
    
    public static String getLastNVowels(String str, int n) {
        int vowelCount = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
                sb.insert(0, ch);
                if (vowelCount == n) {
                    return sb.toString();
                }
            }
        }
        
        if (vowelCount < n) {
            return null;
        }
        
        return sb.toString();
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}