package oop;

public class Book {

	private static int count = 0;//static

	public Book() {

		count++;
	}
	
	public static int getCount(){//static
		return count;
	}
	
	
}
