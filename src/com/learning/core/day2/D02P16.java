package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
			System.out.print("0");
		if(n==2)
			System.out.print("0,1");
		
		  int a=0,b=1,c=1;
		  
		  for(int i=0;i<n;i++)
		  {    
			    if(i!=n-1)
			   {
			  System.out.print(a+",");
			    }
			    else
			    {
			    	System.out.print(a);
			    }
			  a=b;
			  b=c;
			  c=a+b;
		  }

	}

}
