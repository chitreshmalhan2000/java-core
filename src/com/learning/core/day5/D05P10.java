package com.learning.core.day5;
import java.util.*;
public class D05P10 {

	public static void main(String[] args) {
		   TreeSet<Person> persons = new TreeSet<>();
	        persons.add(new Person("1", "Jones", 22, 6999.0));
	        persons.add(new Person("2", "Smith", 30, 2999.0));
	        persons.add(new Person("3", "Popeye", 35, 5999.0));
	        persons.add(new Person("4", "Johan", 22, 6999.0));
	        persons.add(new Person("5", "John", 28, 1999.0));
	        persons.add(new Person("6", "Tom", 42, 3999.0));
	        
	        // Print the first person whose name starts with "J"
	        for (Person person : persons) {
	            if (person.getName().startsWith("J")) {
	                System.out.println(person);
	                break;
	            }
	        }
	    }
	}