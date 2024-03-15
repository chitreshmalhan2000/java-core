package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class Studentclass implements Serializable {
   private int Age,RollNumber;
   private String Name;
    private String Address;
   Studentclass(String n,int a,int r,String ad)
   {
	   Age=a;
	   RollNumber=r;
	   Name=n;
	   Address=ad;
   }
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public int getRollNumber() {
	return RollNumber;
}
public void setRollNumber(int rollNumber) {
	RollNumber = rollNumber;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
