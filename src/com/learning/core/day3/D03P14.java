package com.learning.core.day3;
import java.util.*;
public class D03P14 {
	 public static void main(String[] args) {  
	        int[] arr1; 
	        int[] arr2;  
	        int m,n;
	        Scanner sc=new Scanner(System.in);
	        m=sc.nextInt();
	         arr1= new int[m];
	        for(int i=0;i<m;i++)
	        {
	        	arr1[i]=sc.nextInt();
	        }
	        n=sc.nextInt();
	        arr2= new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	arr2[i]=sc.nextInt();
	        }
	        TreeSet<Integer> set = new TreeSet<>();    
	        for (int i = 0; i < m; i++) {  
	            set.add(arr1[i]);  
	        }  
	        for (int i = 0; i < n; i++) {  
	            set.add(arr2[i]);  
	        }  
	        System.out.print("Union: ");
	        Iterator<Integer> iterator = set.iterator();  
	        while (iterator.hasNext()) {  
	            System.out.print(iterator.next() + " ");  
	        }
	        System.out.print(" Intersection:");
	        
	        int i = 0, j = 0;
	        while (i < m && j < n) {
	            if (arr1[i] < arr2[j])
	                i++;
	            else if (arr2[j] < arr1[i])
	                j++;
	            else {
	                System.out.print(arr2[j++] + " ");
	                i++;
	            }
	        }
	        
}
	 }
