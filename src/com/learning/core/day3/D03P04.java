package com.learning.core.day3;
import java.util.*;
public class D03P04 {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=-1,index=-1,in=-1;
		for(int i=0;i<N;i++)
		{    temp=a[i];
			for(int j=i+1;j<N;j++)
			{
				if(temp==a[j])
				{   index=j;
				    in=1;
					break;
					
				}
			}
			if(in==1)
				break;
		}
		System.out.print(temp);

	}

}
