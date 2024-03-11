package com.learning.core.day6;
import java.util.*;
public class D06P10 {
	 public static void main(String[] args) {
	        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
	        Employee emp1 = new Employee(101, "John Doe", "Manager","HR");
	        Employee emp2 = new Employee(102, "Jane Smith", "Accountant","Finance");
	        Employee emp3 = new Employee(103, "Alice Johnson","Developer","IT");
	        Employee emp4 = new Employee(104, "Bob Williams", "Product Manager", "Development");
	        employeeTable.put(emp1.id, emp1);
	        employeeTable.put(emp2.id, emp2);
	        employeeTable.put(emp3.id, emp3);
	        employeeTable.put(emp4.id, emp4);
	        boolean isEmpty = employeeTable.isEmpty();
	        System.out.println(isEmpty);
	    }
	}