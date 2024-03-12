package com.learning.core.day7;
import java.util.*;
public class D07P03 {

	public static void main(String[] args) {
		Stack s=new Stack(8);
         s.push("J");
         s.push("a");
         s.push("v");
         s.push("a");
         s.push("Q");
         s.push("u");
         s.push("i");
         s.push("z");
         while(!s.isEmpty())
         {
        	 System.out.print(s.pop());
         }
        	 
	}

}
