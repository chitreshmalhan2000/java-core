package com.learning.core.day3;
import java.util.*;
public class D03P03 {

	public static void main(String[] args) {
		//int  A[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int A[]=new int[18];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<18;i++)
		{
			A[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=14;i++)
               sum+=A[i];
		A[15]=sum;
		int Length=A.length;
		int av=0;
		    sum=0;
		for(int i=0;i<Length;i++)
			sum+=A[i];
		av=sum/Length;
		A[16]=av;
		int small=A[0];
		for(int i=1;i<Length;i++) {
			if(small>A[i])
				small=A[i];
		}
		A[17]=small;
		for(int i=0;i<Length;i++)
			System.out.print(A[i]+" ");
		
	}

}
