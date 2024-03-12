package com.learning.core.day7;
class Node{
	String value;
	Node next;
}
public class LinkedListStack {
      Node head;
      public LinkedListStack()
      {
    	  head=null;
      }
      public void push(String data)
      {
    	  Node extraNode=head;
    	  head=new Node();
    	  head.value=data;
    	  head.next=extraNode;
      }
      public boolean isEmpty() {
    	  return(head==null);
      }
      public String pop()
      {
    	  if(isEmpty()) {
    		  return"Stack is Empty";
    	  }
    	  else {
    		  String topvalue=head.value;
    		  head=head.next;
    		  return topvalue;
    	  }
      }
      public void display()
      {
    	  if(head==null)
    		  System.out.println("Stack is Empty");
    	  else {
    		  
    		  Node t=head;
    		  while(t!=null)
    		  {
    			  System.out.print(t.value+" ");
    			  t=t.next;
    		  }
    		  
    	  }  
    	  
      }
}
