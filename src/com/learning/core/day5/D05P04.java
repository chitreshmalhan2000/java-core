package com.learning.core.day5;
import java.util.*;

public class D05P04 {

	public static void main(String[] args) {
		 HashSet<Product> products = new HashSet<>();
		    products.clear();
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Zen"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));

	        boolean found=false;
	        for (Product product : products) {
	            if (product.getProductId().equals("P003")) {
	                found = true;
	                break;
	            }
	        }
	        if (found) {
	            System.out.println("Product Found");
	        } else {
	            System.out.println("Product Not Found");
	        }
	    }
	}

