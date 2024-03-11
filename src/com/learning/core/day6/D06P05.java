package com.learning.core.day6;
import java.util.*;
public class D06P05 {
	   public static void main(String[] args) {
	        TreeMap<Car, Double> carMap = new TreeMap<>();
	        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
	        carMap.put(new Car("Swift", 305000.0), 305000.0);
	        carMap.put(new Car("Audi", 600100.0), 600100.0);
	        carMap.put(new Car("Benz", 900000.0), 900000.0);
	        for (Car car : carMap.keySet()) {
	            System.out.println(car);
	        }
	    }
	}