package com.learning.core.day6;
import java.util.*;
public class D06P06 {

	public static void main(String[] args) {
		 TreeMap<Car, String> carsMap = new TreeMap<>(Collections.reverseOrder());
	        carsMap.put(new Car("Benz", 900000.0), "Luxury");
	        carsMap.put(new Car("Audi", 600100.0), "Premium");
	        carsMap.put(new Car("Swift", 305000.0), "Compact");
	        carsMap.put(new Car("Bugatti", 80050.0), "Super");
	        for (Map.Entry<Car, String> entry : carsMap.entrySet()) {
	            System.out.println(entry.getKey().getName() + " " + entry.getKey().getPrice());
	        }
	    }
	}