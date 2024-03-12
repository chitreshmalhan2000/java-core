package com.learning.core.day7;
import java.util.*;
public class D07P06 {

	public static void main(String[] args) {
		Stack s=new Stack(5);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			s.push(sc.next());
		   int minimum=Integer.MAX_VALUE;
		   int a=0;
		   for(int i=0;i<5;i++)
		   {    
			   int n=Integer.parseInt(s.arr[i]);
			   if(minimum>n)
				   minimum=n;
		   }
		   System.out.println(minimum);

	}

}
