package com.learning.core.day9;
import java.util.*;
public class D09P03 {
	
	public void LinearSearch(int a[],int n,int k)
	{
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			{
				System.out.println("Element is present");
				return;
			}
			
		}
		System.out.println("Element is not present");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int s;
		int key;
		s=sc.nextInt();
		arr= new int[s];
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		key=sc.nextInt();
		D09P03 O=new D09P03();
		O.LinearSearch(arr, s, key);	
	}

}
