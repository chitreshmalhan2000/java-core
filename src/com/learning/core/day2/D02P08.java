package com.learning.core.day2;
import java.util.*;
public class D02P08 {

	public static void main(String[] args) {
		int i,a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for( i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.print(sum);

	}

}
