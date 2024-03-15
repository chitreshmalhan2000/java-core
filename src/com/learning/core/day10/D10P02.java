package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P02 {
public static void main(String[] args) {
	try {
		 String s;
		 Scanner sc=new Scanner(System.in);
		 s=sc.next();
	  if(s.equals("yes"))
	{
	Studentclass obj1=new Studentclass("Chitresh",23,101903662,"Nawanshahar");
	Studentclass obj2=new Studentclass("Rahul",24,101903663,"Banga");
	FileOutputStream fo=new FileOutputStream("src/com/learning/core/day10/NewSer.txt");
	ObjectOutputStream out=new ObjectOutputStream(fo);
	out.writeObject(obj1);
	out.writeObject(obj2);
	out.flush();
	out.close();
			   }
			   else {
				   System.out.println("current program is terminated");
			   }
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
