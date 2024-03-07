package com.learning.core.day5;
import java.util.*;
public class D05P07 {

	public static void main(String[] args) {
		

		TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("1", "Jerry", 22, 999.0));
        persons.add(new Person("2", "Smith", 30, 2999.0));
        persons.add(new Person("3", "Popeye", 35, 5999.0));
        persons.add(new Person("4", "Jones", 40, 6999.0));
        persons.add(new Person("5", "John", 28, 1999.0));
        persons.add(new Person("6", "Tom", 42, 3999.0));

        // Print id, name, and salary of each person
        for (Person person : persons) {
            System.out.println(person.getId() + " " + person.getName() + " " + person.getSalary());
        }
    }
}
