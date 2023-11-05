package Que4;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=");
		builder.append(isbn);
		builder.append(", price=");
		builder.append(price);
		builder.append(", authorName=");
		builder.append(authorName);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

	public void acceptBook(Scanner sc) {
		System.out.println("Enter book details : ");
		System.out.println("Enter isbn : ");
		this.isbn = sc.next();
		System.out.println("Enter price : ");
		this.price = sc.nextDouble();
		System.out.println("Enter author name : ");
		this.authorName = sc.next();
		System.out.println("Enter quantity : ");
		this.quantity = sc.nextInt();
		System.out.println("============================");
		System.out.println("Book accepted successfullt !");
		System.out.println("============================");
	}

	@Override
	public int compareTo(Book o) {
		int diff = this.isbn.compareTo(o.isbn);
		return diff;
	}

}
