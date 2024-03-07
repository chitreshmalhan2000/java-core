package com.learning.core.day4;
import java.util.*;
public class D04P01 {

	public static void main(String[] args) {
		try {
			int n;
			float k;
			String ss1;
			String ss2;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			ss1=sc.next();
			ss2=sc.next();
			k=sc.nextFloat();
			
			BankAccount o=new BankAccount(n,ss1,ss2,k);
		}
       catch(LowBalanceException e1)
       {
    	   System.out.println("LowBalance");
    	  
    	   
       }
		catch(NegativeAmount e2)
		{
			System.out.println("NegativeAmount");
		}
	}

}
