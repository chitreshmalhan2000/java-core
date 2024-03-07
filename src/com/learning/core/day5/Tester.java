package com.learning.core.day5;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		  Register<Employee> employeeRegister = new Register<Employee>();
	        Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");
	        employeeRegister.display(employee);

	        Register<Student> studentRegister = new Register<Student>();
	        Student student = new Student("Joseph", 9123412780L,2210, "SJLD1717K");
	        studentRegister.display(student);
	    }
	}
