package com.learning.core.day6;
import java.util.*;
public class D06P04 {

	public static void main(String[] args) {
		// we have to override in Book class.
		/*@Override
	    public int compareTo(Book otherBook) {
	        return this.author.compareTo(otherBook.author);
	    }*/
        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));
        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        for (Book book : bookSet) {
            System.out.println(book);
            System.out.println();
        }
    }
}


