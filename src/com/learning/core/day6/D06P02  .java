package com.learning.core.day6;
import java.util.*;
public class D06P02 {

	public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");
        String searchName;
        Scanner sc=new Scanner(System.in);
        searchName=sc.next();
        if (phoneBook.containsKey(searchName)) {
            String phoneNumber = phoneBook.get(searchName);
            System.out.println(phoneNumber);
        } else {
            System.out.println("Name not found in the phone book.");
        }
    }
}
