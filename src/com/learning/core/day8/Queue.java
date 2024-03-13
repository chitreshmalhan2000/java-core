package com.learning.core.day8;
public class Queue {
          int front=-1;
          int rear=-1;
          int arr[];
          int n;
        public Queue(int n)
      {
	       this.n=n;
	       this.arr=new int[n];
      }
       public boolean isFull()
     {
	      return rear==n-1;
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
    		  rear++;
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
    		  front++;
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
    	  for(int i=this.front;i<=this.rear;i++)
    	  {
    		  System.out.print(arr[i]+" ");
    	  }		  
    		  
      }
}
