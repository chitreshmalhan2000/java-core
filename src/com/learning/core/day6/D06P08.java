package com.learning.core.day6;
import java.util.*;
public class D06P08 {

	public static void main(String[] args) {
		TreeMap<Car, String> carsMap = new TreeMap<>();
        carsMap.put(new Car("Benz", 900000.0), "Luxury");
        carsMap.put(new Car("Audi", 600100.0), "Premium");
        carsMap.put(new Car("Swift", 305000.0), "Compact");
        carsMap.put(new Car("Bugatti", 80050.0), "Super");
        Map.Entry<Car, String> highestEntry = carsMap.pollLastEntry();
        for (Car car : carsMap.keySet()) {
            System.out.println(car);
        }
    }
}


