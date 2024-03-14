package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P04 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the expression
        System.out.println("Enter the expression:");
        String expression = scanner.nextLine();

        // Evaluate the expression
        int result = evaluateExpression(expression);
        System.out.println("Output:");
        System.out.println(result);

        scanner.close();
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == expression.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                sign = ch;
                num = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}