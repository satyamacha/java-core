
package com.learning.core.Day07;
import java.util.Scanner;
import java.util.Stack;
public class D07P06 {

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

        // Find and print the minimum element in the stack
        int minElement = findMinElement(stack);
        System.out.println("Output:");
        System.out.println(minElement);

        scanner.close();
    }

    public static int findMinElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        int minElement = stack.peek(); // Initialize with the top element of the stack

        // Traverse the stack to find the minimum element
        for (int element : stack) {
            if (element < minElement) {
                minElement = element;
            }
        }

        return minElement;
    }
}