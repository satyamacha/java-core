package com.learning.core.Day02;


import java.util.Scanner;
public class D02P08 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter L: ");
        int L = sc.nextInt();
        System.out.println("Enter R: ");
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