package com.learning.core.day7;
import java.util.*;
public class D07P07 {

	public static void main(String[] args) {
		Stack s=new Stack(4);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
			s.push(sc.next());
		  int n=Integer.parseInt(s.peeek());
		  if(n%2==0)
		   System.out.println("true");
		  else
		  System.out.println("false");

	}

}
