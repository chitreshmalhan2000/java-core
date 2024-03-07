package com.learning.core.day5;
import java.util.*;
public class Register<T> {
	 private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	     String registerId;
	    public String generateRegisterId(int length) {
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }

	    public void display(T user) {
	        if (user instanceof Employee) {
	            Employee employee = (Employee) user;
	            System.out.println(generateRegisterId(7) + " " + employee.getName() + " " + employee.getPhoneNo() + " " + employee.getEmployeeId() + " " + employee.getPassportNo());
	        } else if (user instanceof Student) {
	            Student student = (Student) user;
	            System.out.println(generateRegisterId(7) + " " + student.getName() + " " + student.getPhoneNo() + " " + student.getLicenseNo()+ " "+student.getPanCardNo());
	        } else {
	            System.out.println("Invalid user type");
	        }
	    }
	}

