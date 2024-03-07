package com.learning.core.day4;
import java.util.*;
public class CricketRating {
     String playerName,Coins;
     float critic1,critic2,critic3,avgRating;
     public CricketRating(String a,float b)throws NotEligibleException
     {
    	 throw new NotEligibleException();
     }
     public CricketRating(String pn1,float c11,float c22)throws NotEligibleException
     {
    	 playerName=pn1;
    	 critic1=c11;
    	 critic2=c22;
    	 avgRating=(c11+c22)/2;
    	 if(avgRating>=7)
  	   {   
  		   Coins="gold";
  		   
  	   }
  	   else if(avgRating>=5&&avgRating<7)
  	   {     Coins="silver";
  		   
  	   }
  	   else if(avgRating>=2&&avgRating<5)
  	   {
  		  Coins="copper";
  		   
  	   }
  	   else
  	   {
  		   throw new NotEligibleException();
  	   }
    	  
      System.out.print(playerName+" ");
   	  System.out.printf(" %.2f",avgRating);
   	  System.out.print(" "+Coins);
    	 
    	 
     }
     
      CricketRating(String pn,float c1,float c2,float c3)throws NotEligibleException
     {
    	 playerName=pn;
    	 critic1=c1;
    	 critic2=c2;
    	 critic3=c3; 
    	 avgRating=(c1+c2+c3)/3;
    	 if(avgRating>=7)
    	   {   
    		   Coins="gold";
    		   
    	   }
    	   else if(avgRating>=5&&avgRating<7)
    	   {     Coins="silver";
    		   
    	   }
    	   else if(avgRating>=2&&avgRating<5)
    	   {
    		  Coins="copper";
    		   
    	   }
    	   else
    	   {
    		   throw new NotEligibleException();
    	   }
      	  
    	  System.out.print(playerName+" ");
    	  System.out.printf(" %.2f",avgRating);
    	  System.out.print(" "+Coins);
     }
    
   void calculateAverageRating(float c1,float c2)
   {
	    avgRating=(c1+c2)/2;
   }
   void calculateAverageRating(float c1,float c2,float c3)
   {
	   avgRating=(c1+c2+c3)/3;
   }
   String calculateCoins() throws NotEligibleException
   {
	   if(avgRating>=7)
	   {   
		  // Coins=gold;
		   return "gold";
	   }
	   else if(avgRating>=5&&avgRating<7)
	   {  // Coins=silver;
		   return "silver";
	   }
	   else if(avgRating>=2&&avgRating<5)
	   {
		  // Coins=copper;
		   return "copper";
	   }
	   else
	   {
		   throw new NotEligibleException();
	   }
	   
   }
   void display()
   {
	   System.out.print(playerName+" ");
 	   System.out.printf(" %.2f",avgRating);
 	   System.out.print(" "+Coins);
   }
}
