package com.tester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.helper.PriceComparator;
import com.shop.Book;

enum Menu {
	EXIT, ADD_BOOK, DISPLAY_BOOKS, SEARCH, DELETE_BY_ISBN, DELETE_BY_INDEX, DELETE_BY_AUTHOR, 
	SORT_BY_ISBN_ASCENDING, SORT_BY_PRICE_DESCENDING, REVERSE, SAVE_IN_FILE, LOAD_FROM_FILE
}

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		
		List<Book> arr = new ArrayList<Book>();
		Book book;
		int index;
		
		while ((choice = menuChoice(sc)) != 0) {
			switch(choice) {
			// Add a book
			case 1:			
				book = new Book();
				System.out.print("Enter ISBN of book: ");
				String isbn = sc.next();
				book.setIsbn(isbn);
				
				index = arr.indexOf(book);
				// Add quantity if book present
				if (index != -1) {		
					int sum = arr.get(index).getQuantity();
					System.out.print("Book already exists\nAmount you want to add: ");
					sum += sc.nextInt();
					arr.get(index).setQuantity(sum);
					System.out.println("New quantity = " + arr.get(index).getQuantity());
				}
				// Add a book if not present
				else {				
					book.accept(sc);
					arr.add(book);					
				}
				break;
				
			// Display all books
			case 2:			
				if (arr.size() > 0)
					for (int i = 0; i < arr.size(); i++)
						System.out.println(arr.get(i).toString());
				else
					System.out.println("Library is empty!");
				break;
				
			// Search for a book by its isbn
			case 3:			
				book = new Book();
				System.out.print("Enter ISBN of book: "); 
				String key1 = sc.next();
				book.setIsbn(key1);
				
				index = arr.indexOf(book);
				if (index != -1) {
					System.out.println("Book Found-");
					System.out.println(arr.get(index).toString());
				}
				else
					System.out.println("Book not found!");
				break;
				
			// Delete a book by its isbn
			case 4:			
				book = new Book();
				System.out.print("Enter ISBN of book: ");
				String key2 = sc.next();
				book.setIsbn(key2);
				
				index = arr.indexOf(book);
				if (index != -1) {
					arr.remove(index);
					System.out.println("Deleted the book");					
				}
				else
					System.out.println("Book not found!");
				break;
				
			// Delete a book by its index
			case 5:			
				book = new Book();
				System.out.print("Enter the index: ");
				index = sc.nextInt();
				
				if (index < arr.size() && index > -1) {
					arr.remove(index);
					System.out.println("Deleted the book");					
				}
				else {
					System.out.println("Book not found!");
				}
				break;
				
			// Delete a book by its author name	
			case 6:			
				book = new Book();
				System.out.print("Enter author name: ");
				String author = sc.next();
				
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getAuthor().compareTo(author) == 0) {
						System.out.println("Deleted the book by author " + arr.get(i).getAuthor());
						arr.remove(i);
						break;
					}
				}
				break;
				
			// Sort the list in ascending order of isbn
			case 7:			
				Collections.sort(arr);
				System.out.println("New sorted list-");
				for (Book ele:arr)
					System.out.println(ele.toString());
				break;
				
			// Sort the list in descending order of price
			case 8:			
				Collections.sort(arr, new PriceComparator());
				System.out.println("New sorted list-");
				for (Book ele:arr)
					System.out.println(ele.toString());
				break;
				
			// Reverse the list
			case 9:			
				Collections.reverse(arr);
				System.out.println("The order of books has been reversed!");
				for (Book ele:arr)
					System.out.println(ele.toString());
				break;
				
			case 10:
				if (arr.size() > 0) {
					try (FileOutputStream fout = new FileOutputStream("books.db")) {
						try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {
							
							oout.writeObject(arr);
							
							System.out.println("Books saved: " + arr.size());
						}	// oout.close()
					}	// fout.close()
					catch (Exception e) {
						e.printStackTrace();
					}					
				}
				else
					System.out.println("Library is empty!");
				break;
				
			case 11:
				try (FileInputStream fin = new FileInputStream("books.db")) {
					try (ObjectInputStream oin = new ObjectInputStream(fin)) {
						
						arr = (List<Book>)oin.readObject();
					}	// oin.close()
				}	// fin.close()
				catch (Exception e) {
					e.printStackTrace();
				}
				arr.forEach(e -> System.out.println(e));
				break;
				
			default:
				System.out.println("Kindly select a valid choice!");
				break;
			}
		}
		
	}
	
	public static int menuChoice(Scanner sc) {
		int choice;
		Menu[] menu = Menu.values();
		
		System.out.println("----------------------");
		for (Menu option:menu)
			System.out.println(option.ordinal() + ". " + option.name());
		System.out.println("----------------------");
		System.out.print("Select your choice: ");
		choice = sc.nextInt();
		System.out.println("----------------------");
		
		return choice;
	}
}
