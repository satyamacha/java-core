package com.learning.core.day2;


import java.util.Scanner;
public class D02P08 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Left integer in the range: ");
        int L = sc.nextInt();
        System.out.println("Enter Right integer in the range: ");
        int R = sc.nextInt();
        int sum=0;
        for(int i=L;i<=R;i++)
        {
        	sum=sum+i;
        }
        System.out.println("Sum of the elements in the provided range:" + sum );
        
		sc.close();
	}
}