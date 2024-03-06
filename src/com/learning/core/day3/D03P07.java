package com.learning.core.day3;
import java.util.*;

public class D03P07 {
	static HashSet<String> st = new HashSet<>();
	static void subsequence(String str)
	{
	  for (int i = 0; i < str.length(); i++)
	{
		for (int j = str.length(); j > i; j--) 
		{
			String sub_str = str.substring(i, j);

			if (!st.contains(sub_str))
					st.add(sub_str);
		 for (int k = 1; k < sub_str.length() - 1;k++)
		 {
				StringBuffer sb= new StringBuffer(sub_str);
					sb.deleteCharAt(k);
					if (!st.contains(sb))
					subsequence(sb.toString());
				}
			}
		}
	}
public static void main(String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		subsequence(s);
		 int n=st.size();
		 String []ans=new String[n];
		 int i=0;
		 for(String d:st)
		 {   
            ans[i]=d;
            i++;
		 }
		    i=0;
		 for(String e:st)
		 {     if(i!=n-1)
			 System.out.print(e +",");
		 else
			 System.out.print(e);
		    i++;
		 }
	}
}
