package com.learning.core.day2;
import java.util.*;

public class D02P12 {

	public static void main(String[] args) {
		int n;
		Scanner sr =new Scanner(System.in);
		    n=sr.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
