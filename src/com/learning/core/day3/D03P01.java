package com.learning.core.day3;
import java.util.*;
public class D03P01 {

	public static void main(String[] args) {
		String s1;
		String result1;
		Scanner sc1=new Scanner(System.in);
		s1=sc1.next();
		int length1=s1.length();
		String uppercase1=s1.toUpperCase();
		StringBuffer buffer1=new StringBuffer(s1);
		 String rev1 =  buffer1.reverse().toString();
		if(rev1.equals(s1))
		{
			result1="It is a palindrome";
		}
		else
		{
			result1="It is not a palindrome";
			
		}
		
		String s2;
		String result2;
		Scanner sc2=new Scanner(System.in);
		s2=sc2.next();
		int length2=s2.length();
		String uppercase2=s2.toUpperCase();
		StringBuffer buffer2=new StringBuffer(s2);
		 String rev2 =  buffer2.reverse().toString();
		if(rev2.equals(s2))
		{
			result2="It is a palindrome";
		}
		else
		{
			result2="It is not a palindrome";
			
		}
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
