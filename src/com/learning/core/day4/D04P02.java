package com.learning.core.day4;
import java.util.*;
public class D04P02 {

	public static void main(String[] args) {
    try
    	{
    	   float n1=9.3f;
    	   float n2=9.67f;
    	   float n3=8.7f;
    	   String s;
    	   Scanner sc=new Scanner(System.in);
    	    s=sc.next();
    	    n1=sc.nextFloat();
    	    n2=sc.nextFloat();
    	    n3=sc.nextFloat();
    	CricketRating a =new CricketRating(s,n1,n2,n3);
    	  s=sc.next();
  	      n1=sc.nextFloat();
    	CricketRating b=new CricketRating(s,n1);
    	}
    	
    catch(NotEligibleException e)
    {
    	System.out.println("NotEligible");
    }
    
	}

}
