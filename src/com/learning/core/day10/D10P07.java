package com.learning.core.day10;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;


public class D10P07 {
	@Test
	public void testAdd()
	{
		assertEquals(18,calculator.add(9,9));
	}
	
	@Test
	public void testSub()
	{
		assertEquals(18,calculator.Sub(27,9));
	}
}

class calculator
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int Sub(int a,int b)
	{
		return a-b;
	}
}