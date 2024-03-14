package com.learning.core.day7;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            return Double.NaN; // Indicates stack underflow
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        System.out.print("The elements of the stack are: ");
        stack.printStack();

        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.printStack();
    }
}
