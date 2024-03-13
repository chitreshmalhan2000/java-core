package com.learning.core.day8;
public class CircularQueue {
	   int front=-1;
       int rear=-1;
       int arr[];
       int n;
     public CircularQueue(int n)
   {
	       this.n=n;
	       this.arr=new int[n];
   }
    public boolean isFull()
  {
	      return ((rear+1)%n)==front;
  }
   public boolean isEmpty()
{
 	  return front==-1&&rear==-1;
	
}
   public void enqueue(int data)
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
 		  rear=(rear+1)%n;
 		  arr[rear]=data;
 	  }
 	  
   }
   
   public int dequeue() {
 	  if(isEmpty()) {
 		  System.out.println("Queue is Empty");
 		  return -1;
 	  }
 	  else if(front==rear)
 	  {
 		  int top=arr[front];
 		  front=rear=-1;
 		  return top;
 	  }
 	  else {
 		  int top=arr[front];
 		  front=(front+1)%n;
 		  return top;
 	  }
 	  
   }
   public int peek()
   {
 	  if(isEmpty()) {
 		  System.out.println("Queue is Empty");
 		  return -1;
 	  }
 	  else {
 		  int top=arr[front];
 		  return top;
 	  }  
   }	
   public void display()
   {
	   if(isEmpty()) {
	 		  System.out.println("Queue is Empty");
	 	  }
	   if(rear>=front)
	   {  
 	     for(int i=this.front;i<=this.rear;i++)
 	    {
 		  System.out.print(arr[i]+" ");
 	     }	}
	   else
	   {
		   for(int i=front;i<arr.length;i++)
		   {
			   System.out.print(arr[i]+" ");  
		   }
		   for(int i=0;i<=rear;i++)
		   {
			   System.out.print(arr[i]+" ");  
		   }
		   
	   }
 		  
   }
}


