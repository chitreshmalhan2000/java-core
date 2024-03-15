package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest { //D10P07
	
	@Test
	public void testAdd()
	{
		Calculator c1=new Calculator();
		assertEquals(30,c1.add(20, 10));
	}

	
	 @Test
	 public void testSub()
	 {
			Calculator c2=new Calculator();
			assertEquals(10,c2.sub(20, 10));
	 }
}
