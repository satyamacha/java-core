package com.learning.core.day10;
import static org.junit.Assert.*;
import org.junit.Test;

public class D10P08
{
	@Test
	public void testAdd()
	{
		assertEquals(12,calculator1.add(7,5));
	}
	@Test
	public void testSub()
	{
		assertEquals(7,calculator1.Sub(10,3));
	}
    @Test
    public void testmul() 
    {
        assertEquals(40, calculator1.mul(5, 8));
    }
    @Test
    public void testdiv() {
        try 
        {
            assertEquals(3, calculator1.div(30, 0));
            calculator1.div(10, 0); 
            fail("Expected ArithmeticException to be thrown");
        } 
        catch (ArithmeticException e) 
        {
            assertTrue(true);
        }
    }
}

class calculator1 
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
}