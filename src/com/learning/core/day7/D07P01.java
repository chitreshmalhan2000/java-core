package com.learning.core.day7;
import java.util.*;
public class D07P01 {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push("Hello");
		s.push("world");
		s.push("java");
		s.push("Programming");
		System.out.print("After Pushing 4 Elements:");
		s.display();
		String popped_item = s.pop();
		System.out.println("");
		System.out.print("After a Pop:");
		s.display();

	}

}
