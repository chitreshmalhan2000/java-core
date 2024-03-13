package com.learning.core.day8;
import java.util.*;
public class D08P04 {
	public static void main(String[] args) {
		QueueString q=new QueueString(6);
		/*if(q.isEmpty())  //with no input.
			System.out.print("Empty");
		else
     		System.out.print("Not Empty");*/
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++)     //with taking input.
			q.enqueue(sc.next());
		if(q.isEmpty())
			System.out.print("Empty");
		else
     		System.out.print("Not Empty");   
	}

}
