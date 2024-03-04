package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int res=1;
		for(int i=0;i<b;i++)
		{
			res*=a;
		}
		System.out.println(res);
}
}