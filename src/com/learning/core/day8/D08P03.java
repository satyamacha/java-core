
package com.learning.core.day8;
import java.util.Scanner;
public class D08P03 {

  private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public D08P03(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        int i = front;
        while (i != rear) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println(queueArray[rear]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();
        D08P03 circularQueue = new D08P03(size);

        System.out.print("Enter elements to insert separated by spaces: ");
        for (int i = 0; i < size; i++) {
            circularQueue.insert(scanner.nextInt());
        }

        System.out.print("Elements in circular queue: ");
        circularQueue.display();

        int removedElement = circularQueue.remove();
        System.out.println("After removing first element: ");
        circularQueue.display();
    }
}