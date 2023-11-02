package Que3;

import java.util.Objects;
import java.util.Scanner;

public class Book {
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
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
//		
		if (o instanceof Book) {
			Book other = (Book) o;
			if (this.isbn.equals(other.isbn))// for comparing String use equals method
				return true;
//			if (this.quantity == other.quantity)// for comparing primitives use . dot
//				return true;
		}
		return false;
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

	public void accept(Scanner sc) {
//		private String isbn;
//		private double price;
//		private String authorName;
//		private int quantity;
		System.out.println("Enter isbn number :");
		this.isbn = sc.next();
		System.out.println("Enter price :");
		this.price = sc.nextDouble();
		System.out.println("Enter author name :");
		this.authorName = sc.next();
		System.out.println("Enter quantity :");
		this.quantity = sc.nextInt();
	}
}
