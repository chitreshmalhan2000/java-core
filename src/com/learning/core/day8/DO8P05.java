package com.learning.core.day8;
import java.util.*;
public class DO8P05 {
	public static void main(String[] args) {
		Queue q=new Queue(7);
		Queue[] a=new Queue[2];
		Queue odd=new Queue(7);
		Queue even=new Queue(7);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++)
			q.enqueue(sc.nextInt());
		a[0]=odd;
		a[1]=even;
		while(!q.isEmpty())
		{
			int data=q.dequeue();
			if(data%2==0)
				even.enqueue(data);
			else
				odd.enqueue(data);
		}
		System.out.print("Odd Queue:");
		odd.display();
		System.out.println("");
		System.out.print("Even Queue:");
		even.display();	

	}

}
