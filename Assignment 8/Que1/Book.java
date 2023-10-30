import java.util.Objects;
import java.util.Scanner;

public class Book extends Shop {
	private int isbn;
	private String title;
	private String author;
	private String subject;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int isbn, String title, String author, String subject) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.subject = subject;
	}

//	public Book(int isbn, String title, String author, String subject, double price, double tax) {
//		super(price, tax);
//		this.isbn = isbn;
//		this.title = title;
//		this.author = author;
//		this.subject = subject;
//	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", subject=" + subject + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author, isbn, subject, title);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && isbn == other.isbn && Objects.equals(subject, other.subject)
				&& Objects.equals(title, other.title);
	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter ISBN number of book : ");
		this.isbn = sc.nextInt();
		System.out.println("Enter title : ");
		this.title = sc.next();
		System.out.println("Enter author : ");
		this.author = sc.next();
		System.out.println("Enter subject : ");
		this.subject = sc.next();
		super.accept(sc);
	}

}
