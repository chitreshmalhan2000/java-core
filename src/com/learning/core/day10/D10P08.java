package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class D10P08 {
	
	@Test
	public void testMul()
	{
		Calculator c1=new Calculator();
		assertEquals(200,c1.mul(20, 10));
	}

	
	 @Test
	 public void testDiv1() //without giving exception 
	 {
			Calculator c2=new Calculator();
			assertEquals(2,c2.div(20, 10));
	 }
	 
     @Test(expected=ArithmeticException.class)//giving denominator as Zero(Exception)
     public void testDiv2()
       {
			Calculator c3=new Calculator();
			assertEquals(2,c3.div(20, 0));
	 }
	 
	
	 
}
