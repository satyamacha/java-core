
package com.learning.core.day8;
import java.util.*;
public class D08P05 {

  public List<Queue<Integer>> splitQueue(Queue<Integer> queue) {
        List<Queue<Integer>> result = new ArrayList<>();
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        for (Integer num : queue) {
            if (num % 2 == 0) {
                evenQueue.offer(num);
            } else {
                oddQueue.offer(num);
            }
        }

        result.add(oddQueue);
        result.add(evenQueue);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        D08P05 d08p05 = new D08P05();
        
        System.out.print("Enter the numbers separated by spaces: ");
        String[] nums = scanner.nextLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        for (String num : nums) {
            queue.offer(Integer.parseInt(num));
        }

        List<Queue<Integer>> result = d08p05.splitQueue(queue);

        System.out.print("Odd Queue: ");
        for (Integer num : result.get(0)) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Even Queue: ");
        for (Integer num : result.get(1)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}