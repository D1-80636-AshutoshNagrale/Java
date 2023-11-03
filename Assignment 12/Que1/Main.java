package Que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();

		int counter = 0;
		boolean bool = true;
		do {
			System.out.println("1. Add new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search book using isbn");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete a book with given isbn");
			System.out.println("6. Delete a book with given name");
			System.out.println("7. Sort books by isbn in asc order");
			System.out.println("8. Sort books by price in desc order");
			System.out.println("9. Reverse the list");
			System.out.println("0. EXIT");
			System.out.println("=========================================================");
			System.out.print("Enter your choice : ");
			int key = sc.nextInt();

			switch (key) {
			case 1:
				Book b = new Book();
				b.acceptBook(sc);
//				Book b = new Book("b1", 1000, "BB", 100);

				if (list.indexOf(b) == -1) {
					list.add(b);
					System.out.println("=====================================================");
				} else {
					Book book = list.get(list.indexOf(b));
					System.out.println("Book is already present in library");
					book.setQuantity(book.getQuantity() + b.getQuantity());
					System.out.println("=====================================================");
				}
				break;
			case 2:
				if (!list.isEmpty()) {
					Iterator<Book> iterator = list.iterator();
					while (iterator.hasNext()) {
						Book book = iterator.next();
						System.out.println(book);
					}
					System.out.println("============================================");
				} else {
					System.out.println("List is empty");
					System.out.println("============================================");
				}
				break;
			case 3:
				System.out.println("Enter isbn number : ");
				Book book = new Book();
				book.setIsbn(sc.next());

				if (list.indexOf(book) == -1) {
					System.out.println("Book with entered isbn is not present");
					System.out.println("============================================");

				} else {
					System.out.println(list.get(list.indexOf(book)));
					System.out.println("============================================");

				}
				break;
			case 4:
				for (Book book1 : list) {
					System.out.println(book1);
				}
				System.out.println("Enter which number of book you want to delete from the list : ");
				int no = sc.nextInt();
				if (no <= list.size()) {
					list.remove(no - 1);
					System.out.println("Book deleted successfully");
				} else {
					System.out.println("Please enter correct book number to be deleted");
				}
				break;
			case 5:
				for (Book book1 : list) {
					System.out.println(book1);
				}
				System.out.println("Enter isbn of book you want to delete from the list : ");
				String isbn = sc.next();
				Book b1 = new Book();
				b1.setIsbn(isbn);
				if (list.indexOf(b1) == -1) {
					System.out.println("No book with entered isbn is present");
					System.out.println("==============================================");
				} else {
					list.remove(list.indexOf(b1));
					System.out.println("Book deleted successfully");
					System.out.println("==============================================");
				}
				break;
			case 6:
				for (Book book1 : list) {
					System.out.println(book1);
				}
				System.out.println("Enter author name of book you want to delete from the list : ");
				String authorName = sc.next();

				int index = 0;
				Book book11 = null;

				if (!list.isEmpty()) {
					for (Book book2 : list) {
						if (book2.getAuthorName().equals(authorName)) {
							index = list.indexOf(book2);
							book11 = book2;
							break;
						}
					}
					if (book11 == null) {
						System.out.println("Book with given author name not found");
						System.out.println("=========================================");

					}else {

						list.remove(index);
						System.out.println("Book with given name removed successfully");
						System.out.println("=========================================");
					}
//
//					if (book11.getAuthorName().equals(list.get(index).)) {
//					}
//					if (index == -1) {
//						System.out.println("Book with given author name not found");
//					}
				} else {
					System.out.println("List is empty");
					System.out.println("=============");
				}
//
//				Book b2 = new Book();
//				b2.setAuthorName(authorName);
//				if (list.indexOf(b2) == -1) {
//					System.out.println("No book with entered author name is present");
//					System.out.println("==============================================");
//				} else {
//					list.remove(list.indexOf(b2));
//					System.out.println("Book deleted successfully");
//					System.out.println("==============================================");
//				}
				break;
			case 7:
				class IsbnAscOrder implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {
						int diff = o1.getIsbn().compareTo(o2.getIsbn());
						return diff;
					}
				}
				Collections.sort(list, new IsbnAscOrder());
				for (Book book2 : list) {
					System.out.println(book2);
				}
				break;
			case 8:
				class PriceDescOrder implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {
						int diff = -Double.compare(o1.getPrice(), o2.getPrice());
						return diff;
					}
				}
				Collections.sort(list, new PriceDescOrder());
				for (Book book2 : list) {
					System.out.println(book2);
				}
				break;
			case 9:
				System.out.println("Before reversing the list : ");
				for (Book book2 : list) {
					System.out.println(book2);
				}
				System.out.println("====================================================");
				System.out.println("After reversing the list : ");
				Collections.reverse(list);
				for (Book book2 : list) {
					System.out.println(book2);
				}
				System.out.println("====================================================");
				break;
			case 0:
				System.out.println("Thank you for using the application !");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (bool);
	}
}
