package com.learning.core.day3;
import java.util.*;
public class D03P06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();
        int vowelCount = countVowels(input);
        if (input.length() >= n &&  n== vowelCount) {
        	for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) == 'a'|| input.charAt(i) == 'e'|| input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') 
                    System.out.print(input.charAt(i)); 
                }
        } else {
            System.out.println("Mismatch in Vowel Count");
        }
    }

    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
