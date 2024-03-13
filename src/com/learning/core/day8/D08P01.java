package com.learning.core.day8;

class ArrayQueue {
    private static final int MAX_SIZE = 100;
    private int[] queueArray;
    private int front, rear, size;

    public ArrayQueue() {
        queueArray = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == MAX_SIZE) {
            return; // Indicates queue overflow
        }
        rear = (rear + 1) % MAX_SIZE;
        queueArray[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // Indicates queue underflow
        }
        int dequeued = queueArray[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return dequeued;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}

public class D08P01 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.print("Elements in queue: ");
        queue.printQueue();

        queue.dequeue();

        System.out.print("After removing first element: ");
        queue.printQueue();
    }
}
