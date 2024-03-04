package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {

	public static void main(String[] args) {
		int n;
		Scanner sr=new Scanner(System.in);
		n=sr.nextInt();
		int temp=n;
		int k;
		int mul=0;
		while(temp>0)
		{
			k=temp%10;
			mul=mul*10+k;
			temp=temp/10;
			
		}
		System.out.println(mul);

	}

}
