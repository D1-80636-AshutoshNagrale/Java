package com.sunbeam.genericlcass;

import com.sunbeam.interfaces.Displayable;

public class Box<T extends Displayable> {

	private T obj;

	public T get() {
		return this.obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}
	
	public static void printDisplayableBox(Box b) {
		b.get().display();
	}
}
