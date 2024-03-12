package com.learning.core.day7;
import java.util.*;
public class D07P05 {
	public static void printStack(Stack stt){  
		 if(!stt.isEmpty())  
		{  
		     String temp = stt.pop();  
		     printStack(stt);  
		     System.out.print(temp+" ");  
		     stt.push(temp);  
		    }  
		}    
		public static void insertAtBottom(String item,Stack st) {  
		    if (st.isEmpty()) {  
		        st.push(item);  
		    } else {  
		       String top = st.pop();  
		        insertAtBottom(item,st);  
		        st.push(top);  
		    }  
		}  
		public static void reverse(Stack ss) {  
		    if (!ss.isEmpty()) {  
		         String t = ss.pop();
		        reverse(ss);  
		        insertAtBottom(t,ss);  
		    }  
		}  
		public static void main(String[] args) {
			Stack s=new Stack(4);
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<4;i++)
			s.push(sc.next());
			reverse(s);
			printStack(s);
		}
}
			
			
			
			
			
			
			