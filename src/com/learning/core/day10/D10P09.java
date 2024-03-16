package com.learning.core.day10;
import static org.junit.Assert.*;
import org.junit.Test;

public class D10P09
{
	@Test
	public void testAdd()
	{
		assertEquals(17,calculator2.add(6,11));
	}
	@Test
	public void testSub()
	{
		assertEquals(17,calculator2.Sub(25,8));
	}
    @Test
    public void testmul() 
    {
        assertEquals(12, calculator2.mul(4, 3));
    }
    @Test
    public void testdiv() 
    {
        try 
        {
            assertEquals(3, calculator2.div(30, 0));
            calculator2.div(10, 0); 
            fail("Expected ArithmeticException to be thrown");
        } 
        catch (ArithmeticException e) 
        {
            assertTrue(true);
        }
    }
    @Test
    public void testFindMax()
    {
    	assertEquals(6, calculator2.findMax(new int[] {1,2,3,4,5,6}));
    }
}

class calculator2
{	
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int Sub(int a,int b)
	{
		return a-b;
	}
    public static int mul(int a, int b) 
    {
        return a*b;
    }

    public static int div(int a, int b) 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }
    public static int findMax(int arr[])
    {
    	int max = arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>max)
    		{
    			max=arr[i];
    		}
    	}
    	return max;
    }
}