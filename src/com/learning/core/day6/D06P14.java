package com.learning.core.day6;
import java.util.*;
public class D06P14 {

	public static void main(String[] args) {
		 Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
	        Employee emp1 = new Employee(1001, "Daniel","Analyst","L&D");
	        Employee emp2 = new Employee(1002, "Thomas", "Tester","Testing");
	        Employee emp3 = new Employee(1003, "Robert", "Product Manager", "Development");
	        Employee emp4 = new Employee(1004, "Grace", "Tech Support", "HR");
	        employeeTable.put(emp1.id, emp1);
	        employeeTable.put(emp2.id, emp2);
	        employeeTable.put(emp3.id, emp3);
	        employeeTable.put(emp4.id, emp4);
	        Hashtable<Integer, Employee> currentCollection = new Hashtable<>();
	        currentCollection.put(1005, new Employee(1005, "Charles", "QA Lead","Testing"));
	        currentCollection.put(1006, new Employee(1006, "Henry", "Accountant", "Finance"));
	        employeeTable.putAll(currentCollection);
	        for (Employee employee : employeeTable.values()) {
	            System.out.println(employee);
	        }
	    }
	}

