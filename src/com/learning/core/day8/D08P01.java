package com.learning.core.day8;
import java.util.*;
public class D08P01 {
	public static void main(String[] args) {
		Queue q=new Queue(4);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
			q.enqueue(sc.nextInt());
         System.out.print("Elements in queue:");
          q.display();
         System.out.println("");
        int a= q.dequeue();
        System.out.print("After removing first element:");
        q.display();
	}

}
