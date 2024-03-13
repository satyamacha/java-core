package com.learning.core.Day03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;;
public class D03P05 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        List<List<Integer>> combinations = findCombinations(nums, k);
        
        System.out.println("Distinct combinations of " + k + " elements:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
    
    public static List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        
        backtrack(nums, k, 0, current, result);
        
        return result;
    }
    
    private static void backtrack(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}