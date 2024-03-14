package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;
public class D07P05 {
  static Stack<Character> st = new Stack<>();

    static void insertAtBottom(char x) {
        if (st.isEmpty())
            st.push(x);
        else {
            char a = st.peek();
            st.pop();
            insertAtBottom(x);
            st.push(a);
        }
    }

    static void reverse() {
        if (st.size() > 0) {
            char x = st.peek();
            st.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters for the stack (separated by spaces, press Enter when done):");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            st.push(c);
        }

        System.out.println("Original Stack is:");
        System.out.println(st);

        reverse();

        System.out.println("Reversed Stack is:");
        System.out.println(st);

        scanner.close();
    }
}