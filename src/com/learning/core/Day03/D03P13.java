package com.learning.core.Day03;

import java.util.Scanner;
public class D03P13 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String replacedString = replaceSpaces(input);
        
        System.out.println("Output: " + replacedString);
    }
    
    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}