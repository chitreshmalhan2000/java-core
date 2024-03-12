package com.learning.core.day7;

public class Stack {
	int n;
	String arr[];
	int top;
	Stack(int n)
	{
		this.n=n;
		this.arr=new String[n];
		this.top=-1;
	}
	public boolean isFull()
	{
		return(n-1==top);
	}
	public boolean isEmpty() {
		return(top==-1);
		}
	
	public String pop() {
		if(isEmpty()) {
			return("Stack is Empty");
		}
		else {
			String value=arr[top];
			top--;
			return value;
		}	
	}
	
	public void display() {
		  if(top>=0)
		  {
			  for(int i=0;i<=top;i++)
				  System.out.print(arr[i]+" ");
		  }
		  else
			  System.out.print("Stack is Empty");
	}
	public String peek()
	{
		if(isEmpty())
			return "Stack is Empty";
		else
			return arr[top];	
	}
	public String peeek()
	{
		if(isEmpty())
			return "Stack is Empty";
		else
			return arr[0];	
	}
	public void push(String data)
	{
		if(isFull())
			System.out.println("Stack is Full");
		else {
			top++;
			arr[top]=data;
		}
	}

}
