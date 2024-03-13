package com.learning.core.day8;
import java.util.*;
public class D08P02 {
	public static void main(String[] args) {
		LinkedListQueue q=new LinkedListQueue();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			q.enqueue(sc.nextInt());
         System.out.print("Elements in queue:");
          q.display();
         System.out.println("");
        int a= q.dequeue();
        int b=q.dequeue();
        System.out.print("After removing two elements:");
        q.display();
	}

}
	


