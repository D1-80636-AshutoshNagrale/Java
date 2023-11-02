package com.sunbeam.classes;

import com.sunbeam.genericlcass.Box;
import com.sunbeam.interfaces.Displayable;


public class Tester {
	public static void printDisplayableBox( b) {
		b.get().display();
	}
	
	public static void printAnyBox(Object b) {
		System.out.println(b.get().toString());
	}
	public static void main(String[] args) {
		
		Box<Person> box1 = new Box<Person>();
		box1.set(new Person("abc", 20));
		Box.printDisplayableBox(box1);
		
		Box<Book> box2 = new Box<Book>();
		box2.set(new Book("Sunbeam", 100));
		Box.printDisplayableBox(box2);
//		
//		Box<Car> box3 = new Box<Car>();
//		box3.set(new Car("abc", 20));
//		Tester.printAnyBox(box3);
	}

}
