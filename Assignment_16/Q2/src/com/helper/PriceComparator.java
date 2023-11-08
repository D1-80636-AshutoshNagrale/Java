package com.helper;

import java.util.Comparator;

import com.shop.Book;

public class PriceComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book b1, Book b2) {
		// returning negation(-) of the comparison because
		// we want the sorting to be in descending order of price
		return -Double.compare(b1.getPrice(), b2.getPrice());
	}
}
