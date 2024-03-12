package com.learning.core.day6;
import java.util.*;
public class D06P01 {
	 public static HashMap<String, String> sortByValue(HashMap<String, String> hm)
	    {
	        List<Map.Entry<String, String> > list = new LinkedList<Map.Entry<String, String> >(hm.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<String,String> >() {
	            public int compare(Map.Entry<String,String> o1, 
	                               Map.Entry<String,String> o2)
	            {
	                return (o2.getValue()).compareTo(o1.getValue());
	            }
	        });
	        HashMap<String,String> temp = new LinkedHashMap<String,String>();
	        for (Map.Entry<String,String> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
	    }
		 public static void main(String[] args) {
		        HashMap<String, String> phoneBook = new HashMap<>();
		        phoneBook.put("Amal", "998787823");
		        phoneBook.put("Manvitha", "937843978");
		        phoneBook.put("Joseph", "7882221113");
		        phoneBook.put("Smith", "8293893311");
		        phoneBook.put("Kathe", "7234560011"); 
		        Map<String, String> hm1 = sortByValue(phoneBook);
		        for(Map.Entry<String, String> entry:hm1.entrySet() )    
		        {    
		        System.out.println(entry.getKey() + " " + entry.getValue()); 
		        } 
		        
		    }
		}
