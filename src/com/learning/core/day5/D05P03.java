package com.learning.core.day5;
import java.util.*;
public class D05P03 {

	public static void main(String[] args) {
		    HashSet<Product> products = new HashSet<Product>();
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Zen"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));

	        // List all the Product details
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	}
