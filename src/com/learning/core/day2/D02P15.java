package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int number;
        int cp=0,cn=0,cz=0;
        for(int i=0;i<n;i++)
        {
        	number=sc.nextInt();
        	if(number==0) {
        		cz++;
        	}
        	else if(number>0) {
        		cp++;
        	}
        	else {
        		cn++;
        	}
        }
        System.out.println("No. of Positive Numbers: "+cp);
        System.out.println("No. of Negative Numbers: "+cn);
        System.out.println("No. of Zeros Numbers: "+cz);
	}

}
