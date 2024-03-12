package com.learning.core.day7;
import java.util.*;
public class D07P04 {
	
	 public static int performOperation(int operand1, int operand2, String operator) {
	        switch (operator) {
	                 
	            case "+":
	                return (int) operand1 + operand2;
	            case "-":
	                return(int) operand1 - operand2;
	            case "*":
	                return (int)operand1 * operand2;
	            case "/":
	                if (operand2 != 0) {
	                    return (int) operand1 / operand2;
	                }   
	    }
	              return 0;
	              }

	public static void main(String[] args) {
		Stack s=new Stack(5);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		s.push(sc.next());
		int result=0;
		int[] a1=new int[3];
		String[] c=new String[2];
		int i=0,j=0;
		while(!s.isEmpty()) {
			 if(s.peek().equals("+")||s.peek().equals("-")||s.peek().equals("*")||s.peek().equals("/"))
			 {
				 c[i]=s.pop(); 
				 i++;
			 }
			 else {
				 a1[j]=Integer.parseInt(s.pop());
				 j++;
			 }		 
		}
		result=performOperation(a1[0],a1[1],c[0]);
		result=performOperation(result,a1[2],c[1]);
		System.out.print(result);
	}

}
