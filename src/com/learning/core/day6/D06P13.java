package com.learning.core.day6;
import java.util.*;
public class D06P13 {

	public static void main(String[] args) {
		  Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
	        Employee emp1 = new Employee(1001, "John","Manager","HR");
	        Employee emp2 = new Employee(1002, "Alice", "Accountant", "Finance");
	        Employee emp3 = new Employee(1003, "Robert", "Product Manager", "Development");
	        Employee emp4 = new Employee(1004, "Emily", "Tester", "Testing");
            Employee emp5 = new Employee(1005, "Arun","Analyst","L&D");
	        employeeTable.put(emp1.id, emp1);
	        employeeTable.put(emp2.id, emp2);
	        employeeTable.put(emp3.id, emp3);
	        employeeTable.put(emp4.id, emp4);
	        employeeTable.put(emp5.id,emp5);
	        int numKeys = employeeTable.size();
	        System.out.println(numKeys);
	    }
	}
