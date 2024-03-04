package com.learning.core.day2;
import java.util.*;
public class D02P04 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.print(a);
		}
		else if(b>a&&b>c)
		{
			System.out.print(b);
		}
		else
		{
			System.out.print(c);
		}
	}
}
