package com.learning.core.day5;
import java.util.*;
public class D05P06 {

	public static void main(String[] args) {
		
		TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("5", "John", 32, 1999.0));
        persons.add(new Person("6", "Tom", 42, 3999.0));
        persons.add(new Person("3", "Alice", 25, 2999.0));
        persons.add(new Person("4", "Emily", 23, 2999.0));
        persons.add(new Person("1", "David", 22, 2500.0));
        persons.add(new Person("2", "Sophia", 24, 2800.0));

        // Print all Persons details whose age is greater than 25
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}
