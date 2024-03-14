package com.learning.core.day7;

class ArrayStack {
    private static final int MAX_SIZE = 100;
    private String[] stackArray;
    private int top;

    public ArrayStack() {
        stackArray = new String[MAX_SIZE];
        top = -1;
    }

    public void push(String value) {
        if (top == MAX_SIZE - 1) {
            return; // Indicates stack overflow
        }
        stackArray[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            return null; // Indicates stack underflow
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class D07P01 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        stack.push("Hello");
        stack.push("world");
        stack.push("Java");
        stack.push("Programming");

        System.out.print("After Pushing 4 Elements: ");
        stack.printStack();

        stack.pop();

        System.out.print("After a Pop: ");
        stack.printStack();
    }
}
