package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class D10P09 {

	@Test
	public void testFindMax1()
	{
		Calculator c1=new Calculator();
		assertEquals(6,c1.findMax(new int[] {1,2,3,4,5,6}));
	}
	
	@Test
	public void testFindMax2()
	{
		Calculator c2=new Calculator();
		assertEquals(-1,c2.findMax(new int[] {-1,-2,-3,-4,-5,-6}));
	}

}
