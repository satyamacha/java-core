package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P07 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // Prompt user to enter integers for the stack
        System.out.println("Enter integers for the stack (separated by spaces, press Enter when done):");
        String[] inputTokens = scanner.nextLine().split("\\s+");

        // Push user input integers onto the stack
        for (String token : inputTokens) {
            try {
                stack.push(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter integers only.");
                return;
            }
        }

        boolean result = isTopElementEven(stack);
        System.out.println("Output: " + result);

        scanner.close();
    }

    public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false; // Stack is empty, hence no element to check
        }

        int topElement = stack.peek();
        return topElement % 2 == 0;
    }
}