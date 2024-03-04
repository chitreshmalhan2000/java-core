package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int factorial=1;
	for(int i=1;i<=n;i++) {
		factorial=factorial*i;
	}
    System.out.println("Factorial of "+n+" is "+factorial);
	}

}
