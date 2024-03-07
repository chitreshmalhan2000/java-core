package com.learning.core.day5;
import java.util.*;
public class D05P02 {

	public static void main(String[] args) {
	      ArrayList<String> studentNames = new ArrayList<String>();
	        Scanner sc=new Scanner(System.in);
	         String s;
	         for(int i=0;i<5;i++)
	         {    
	        	 s=sc.next();
	        	 studentNames.add(s);
	         }
	        
	        String nameToFind;
	        nameToFind=sc.next();
	        
	        if (studentNames.contains(nameToFind)) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not found");
	        }
	    }
	}


