package com.learning.core.day3;
import java.util.*;
public class D03P08 {
		static int minimumNumberOfDeletions(String s) {
		int n = s.length();
		int[] dp = new int[n];
		for (int i = n - 2; i >= 0; i--) 
		{         
			  int prev = 0;           
			for (int j = i + 1; j < n; j++)
              {
				int temp = dp[j];
					if (s.charAt(i) == s.charAt(j)) {
						dp[j] = prev;
					} else {
						dp[j] = Math.min(dp[j], dp[j - 1]) + 1;
					}
					prev = temp;
				}
			}
			return dp[n - 1];
		}
	public static void main(String[] args) {
			String s;
			Scanner sc=new Scanner(System.in);
			s=sc.next();
			System.out.println(minimumNumberOfDeletions(s));
		}
	}

	
