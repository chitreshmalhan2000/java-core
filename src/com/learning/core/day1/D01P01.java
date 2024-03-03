package com.learning.core.day1;
import java.util.*;
 class D01P01 {
	    public static Book createBooks(String title, float  price) {
        Book book = new Book();
        book.set_book_title(title);
        book.set_book_price(price);
        return book;
    }
	    public static void showBooks(Book book) {
        System.out.printf("Book Title:" + book.get_book_title()+" and Price:%.2f",book.get_book_price());
    }
	    
    public static void main(String[] args) {
    	Scanner t= new Scanner(System.in);
        String title = t.nextLine();
        float price = t.nextFloat();
        Book book = createBooks(title, price);
        showBooks(book);
    }
}
