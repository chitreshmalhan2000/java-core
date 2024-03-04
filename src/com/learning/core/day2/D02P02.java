package com.learning.core.day2;
import java.util.*;
public class D02P02 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	 if(n<=0) {
		 System.out.println("Invalid Input");
	 }
	 for(int i=0;i<=n;i+=2) {
		   
	     if(i!=0)
	{
		 System.out.print(i);
		 System.out.print(" ");
		    }
	 }
}
}
