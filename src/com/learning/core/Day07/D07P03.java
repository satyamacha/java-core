package com.learning.core.Day07;
import java.util.Scanner;
class CustomStack {
    private char[] array;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        array = new char[size];
        capacity = size;
        top = -1;
    }

    public void push(char value) {
        if (top == capacity - 1) {
            return; // Indicates stack overflow
        }
        array[++top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0'; // Indicates stack underflow
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class D07P03 {
    public static void main(String[] args) {
 //       String input = "JavaQuiz";
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

    	CustomStack stack = new CustomStack(input.length());

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        scanner.close();

        System.out.println("The reversed String is : " + reversedString.toString());
    }
}





