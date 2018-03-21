package oop;

public class BookMain {

	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
//		System.out.println(b1.count);
//		System.out.println(b2.count);
//		System.out.println(b3.count);
		
		System.out.println(Book.getCount());
	}

}
