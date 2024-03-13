package com.learning.core.Day03;


import java.util.*;
public class D03P09 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the strings:");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        
        List<String> result = canFormCircle(strings);
        if (result != null) {
            System.out.println("Circle formed:");
            for (String str : result) {
                System.out.print(str + " ");
            }
        } else {
            System.out.println("Circle cannot be formed.");
        }
    }
    
    public static List<String> canFormCircle(String[] strings) {
        Map<Character, List<String>> graph = buildGraph(strings);
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for (String str : strings) {
            visited.add(str);
            result.add(str);
            if (dfs(graph, visited, result, str.charAt(str.length() - 1), strings.length - 1)) {
                return result;
            }
            visited.remove(str);
            result.remove(result.size() - 1);
        }
        return null;
    }
    
    public static Map<Character, List<String>> buildGraph(String[] strings) {
        Map<Character, List<String>> graph = new HashMap<>();
        for (String str : strings) {
            char startChar = str.charAt(0);
            char endChar = str.charAt(str.length() - 1);
            graph.putIfAbsent(startChar, new ArrayList<>());
            graph.get(startChar).add(str);
        }
        return graph;
    }
    
    public static boolean dfs(Map<Character, List<String>> graph, Set<String> visited, List<String> result, char startChar, int remaining) {
        if (remaining == 0 && startChar == result.get(0).charAt(0)) {
            return true;
        }
        
        if (!graph.containsKey(startChar)) {
            return false;
        }
        
        List<String> neighbors = graph.get(startChar);
        for (String neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                result.add(neighbor);
                if (dfs(graph, visited, result, neighbor.charAt(neighbor.length() - 1), remaining - 1)) {
                    return true;
                }
                visited.remove(neighbor);
                result.remove(result.size() - 1);
            }
        }
        
        return false;
    }
}
	
		
