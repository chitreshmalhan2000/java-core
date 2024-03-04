package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		if(n<0||n>100)
		{
			System.out.println("Invalid Input");
		}
		
		if(n>=60)
		{
			System.out.println("Grade A");
		}
		else if(n>=45)
		{
			System.out.println("Grade B");
		}
		else if(n>=35)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
