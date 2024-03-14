package com.learning.core.day2;

import java.util.Scanner;
public class D02P06 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number representing a weekday (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
	        int dayOfWeek = scanner.nextInt();
	        
	        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
	            String weekday = getWeekday(dayOfWeek);
	            System.out.println("Given number corresponds to : " + weekday);
	        } else {
	            System.out.println("Invalid input");
	        }
	    }
	    
	    public static String getWeekday(int dayOfWeek) {
	        String weekday = "";
	        if (dayOfWeek == 1) {
	            weekday = "Monday";
	        } else if (dayOfWeek == 2) {
	            weekday = "Tuesday";
	        } else if (dayOfWeek == 3) {
	            weekday = "Wednesday";
	        } else if (dayOfWeek == 4) {
	            weekday = "Thursday";
	        } else if (dayOfWeek == 5) {
	            weekday = "Friday";
	        } else if (dayOfWeek == 6) {
	            weekday = "Saturday";
	        } else if (dayOfWeek == 7) {
	            weekday = "Sunday";
	        }
	        return weekday;
	    }
	}

