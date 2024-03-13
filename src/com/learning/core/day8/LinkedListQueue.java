package com.learning.core.day8;
class Node
{
int value; 
Node next;
public Node(int value)

{

this.value = value;
this.next = null;

}}

public class LinkedListQueue
{
Node front, rear;

public void enqueue(int data) {

if(front==null) {
rear= new Node(data);
front= rear;
}
else

{
Node newNode = new Node(data);
rear.next= newNode;
rear= newNode;
}
}

public int dequeue()
{
int res; 
if(front==null)
{
System.out.println("Queue is Empty");
return -1;
}
else
{
	res=front.value;
	front=front.next;
	return res;
}
}
public int peek()
{
	int res; 
	if(front==null)
	{
	System.out.println("Queue is Empty");
	return -1;
	}
	else
	{
		res=front.value;
		return res;
	}
}
public void display() {
    Node  temp;
    if ((front ==null) && (rear ==null)) {
        System.out.print("Queue is Empty");
    } else {
        temp = front;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}
	
}
