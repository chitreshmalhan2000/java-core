package com.learning.core.day5;
import java.util.*;

public class D05P05 {

	public static void main(String[] args) {
	
		  HashSet<Product> products = new HashSet<>();
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Zen"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));

	        // Remove a particular product
	        String productIdToRemove = "P002";
	        
	        Iterator<Product> iterator = products.iterator();
	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            if (product.getProductId().equals(productIdToRemove)) {
	                iterator.remove();
	                break;
	            }
	        }

	        // Display remaining products
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	

	}

