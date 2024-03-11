package com.learning.core.day6;
import java.util.*;
public class D06P09 {

	public static void main(String[] args) {
		 TreeMap<Car, Double> carMap = new TreeMap<>();
	        Car car1 = new Car("Reva", 80000.0);
	        Car car2 = new Car("Toyota", 50000.0);
	        Car car3 = new Car("Honda", 60000.0);
	        Car car4 = new Car("Ford", 70000.0);
	        carMap.put(car1, car1.price);
	        carMap.put(car2, car2.price);
	        carMap.put(car3, car3.price);
	        carMap.put(car4, car4.price);
	        double newPrice;
	        Scanner sc=new Scanner(System.in);
	        newPrice=sc.nextDouble();
	        carMap.replace(car1, newPrice);
	        System.out.println(car1.getName()+" "+carMap.get(car1));
	    }
	}