package com.learning.core.day10;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class D10P10{

@Test(timeout = 2)
public void testName() {
	UserProfile up1=new UserProfile();
	assertTrue(up1.validateUsername("Chitresh"));
	
	
}

@Test (timeout = 2)
public void testPassword()
{
	UserProfile up2=new UserProfile();
	assertTrue(up2.validatePassword("Passabcd"));
	
}
	
}