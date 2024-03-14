package com.learning.core.day9;
import java.util.*;
public class D09P01 {
	public int partition(int arr[],int lb,int ub)
	{
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		while(start<end)
		{
			start=start+1;
			while(start<=ub&&arr[start]<pivot)
				start++;
			while(end>=lb&&arr[end]>pivot)
				end--;
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}
	
   public void QuickSort(int arr[],int lb,int ub)
   {
	   int loc;
	   if(lb<ub)
	   {
		   loc =partition(arr,lb,ub);
		   QuickSort(arr,lb,loc-1);
		   QuickSort(arr,loc+1,ub);
	   }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int s;
		s=sc.nextInt();
		arr= new int[s];
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		D09P01 O=new D09P01();
		O.QuickSort(arr, 0, s-1);
		for(int i=0;i<s;i++)
			System.out.print(arr[i]+" ");

	}

}
