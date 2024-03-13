package com.learning.core.day8;
public class QueueString {
	  int front=-1;
      int rear=-1;
      String arr[];
      int n;
    public QueueString(int n)
  {
       this.n=n;
       this.arr=new String[n];
  }
   public boolean isFull()
 {
      return rear==n-1;
 }
  public boolean isEmpty()
{
	  return front==-1&&rear==-1;

}
  public void enqueue(String data)
  {
	  if(isFull())
		  System.out.println("Queue is full");
	  else if(isEmpty())
	  {
		  rear=front=0;
		  arr[rear]=data;
	  }
	  else
	  {
		  rear++;
		  arr[rear]=data;
	  }
	  
  }
  
  public String dequeue() {
	  if(isEmpty()) {
		  return("Queue is Empty");
	  }
	  else if(front==rear)
	  {
		  String top=arr[front];
		  front=rear=-1;
		  return top;
	  }
	  else {
		  String top=arr[front];
		  front++;
		  return top;
	  }
	  
  }
  public String peek()
  {
	  if(isEmpty()) {
		  return("Queue is Empty");
	  }
	  else {
		  String top=arr[front];
		  return top;
	  }  
  }	
  public void display()
  {
	  for(int i=this.front;i<=this.rear;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }		  
		  
  }
}

