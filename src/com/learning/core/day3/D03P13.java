package com.learning.core.day3;
import java.util.*;
public class D03P13 {
 public static String replaceSpaces(String str) {
     StringBuffer sb = new StringBuffer();
     for (char c : str.toCharArray()) {
         if (c == ' ') {
             sb.append("%20");
         } else {
             sb.append(c);
         }
     }
     return sb.toString();
 }
      public static void main(String[] args) {
           String input;
           Scanner sc=new Scanner(System.in);
           input=sc.nextLine();
           String output = replaceSpaces(input);
           System.out.println(output);
}
}
	
