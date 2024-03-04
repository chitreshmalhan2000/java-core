package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("2");
		int a=3;
		while(a<=n)
		{
		int i=2;
		int flag=0;
		while(i<a)
		{
			if(a%i==0)
				{
				flag=1;
				 break;
				}
			i++;
		}
		       if(flag==0) {
		    	 System.out.print(","+a);
		       }
		       a++;
		}

	}

}
