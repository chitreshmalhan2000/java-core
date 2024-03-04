package com.learning.core.day2;

import java.util.Scanner;

public class D02P09 {

	public static void main(String[] args) {
	
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i=1;
		for(i=1;i<=n;i++)
		{
			System.out.print(i*i*i);
			System.out.print(" ");
		}

	}

}
