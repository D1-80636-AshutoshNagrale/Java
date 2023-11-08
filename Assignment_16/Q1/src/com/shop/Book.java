package com.shop;

import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	private String author;
	private int quantity;
	private double price;
	
	// Constructors
	public Book() {
		this.isbn = "";
		this.author = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	public Book(String isbn, String author, int quantity, double price) {
		this.isbn = isbn;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}
	
	// Getter Methods
	public String getIsbn() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	
	// Setter Methods
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept(Scanner sc) {
//		System.out.print("Enter ISBN: ");
//		this.isbn = sc.next();
		System.out.print("Enter Author: ");
		this.author = sc.next();
		System.out.print("Enter Price: ");
		this.price = sc.nextDouble();
		System.out.print("Enter quantity: ");
		this.quantity = sc.nextInt();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book book = (Book)obj;
			if (book.getIsbn().compareTo(this.isbn) == 0)
				return true;
		}
		return false;
	}
	
	// For sorting in ascending order by ISBN
	@Override
	public int compareTo(Book book) {
		return this.isbn.compareTo(book.getIsbn());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ISBN: ").append(isbn).append(", Author: ").append(author)
		.append(", Price: ").append(price).append(", Quantity: ").append(quantity).append("]");
		
		return sb.toString();
	}
}
