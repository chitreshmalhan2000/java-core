package com.learning.core.day7;
import java.util.*;
public class D07P02 {

	public static void main(String[] args) {
		LinkedListStack lls=new LinkedListStack();
		lls.push("null");
		lls.push("10.0");
		lls.push("20.0");
		lls.push("30.0");
		lls.push("40.0");
		System.out.print("The elements of the stack are:");
		lls.display();
		lls.pop();
		lls.pop();
		System.out.println("");
		System.out.print("After popping twice:");
		lls.display();
		

	}

}
