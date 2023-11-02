package Que3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Book> al = new ArrayList<Book>();
		int counter = 0;
		boolean bool = true;

		do {
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Delete book of given id");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. EXIT");
			System.out.println("==================================================");
			System.out.print("Enter your choice : ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				Book book = new Book();
				book.accept(sc);
				al.add(book);
				counter++;
				System.out.println("Book accepted successfully");
				System.out.println("==========================");
				break;
			case 2:
				if (counter > 0) {
					Iterator<Book> itr = al.iterator();
					while (itr.hasNext()) {
						Book b = itr.next();
						System.out.println(b);
					}
				} else {
					System.out.println("No book is currently present");
				}
				System.out.println("===============================");
				break;
			case 3:
				System.out.println("Enter which number of book you wanna delete");
				int no = sc.nextInt();
				al.remove(no - 1);
				System.out.println("Book deleted successfully");
				System.out.println("================================");
				counter--;
				break;
			case 4:
				System.out.println("Enter isbn number");
				String isbn = sc.next();

				Book b = new Book();
				b.setIsbn(isbn);
				if (al.contains(b)) {// this contains() method of ArrayList internally gives call
					// to overriden equals() method from Object class
					System.out.println("Book with isbn " + isbn + " is present");
					System.out.println("==================================");
				} else {
					System.out.println("Book with isbn " + isbn + " is not present");
					System.out.println("==================================");
				}

//				System.out.println("Enter book quantity");
//				int bookQuantity = sc.nextInt();
//
//				Book b = new Book();
//				b.setQuantity(bookQuantity);
//				if (al.contains(b)) {
//					System.out.println("Book with quantity " + bookQuantity + " is present");
//					System.out.println("==================================");
//				} else {
//					System.out.println("Book with quantity " + bookQuantity + " is not present");
//					System.out.println("==================================");
//				}

				break;
			case 5:
				al.clear();
				counter = 0;
				break;
			case 6:
				System.out.println("There are total " + (counter) + " books in list");

				Iterator iterator = al.iterator();
				while (iterator.hasNext()) {
					Book b1 = (Book) iterator.next();
					System.out.println(b1);
				}
				System.out.println("===============================================");
				break;

			case 7:
				bool = false;
			default:
				System.out.println("Wrong choice enntered.");
				break;
			}

		} while (bool);
		System.out.println("Thank you for using the application");
	}
}
