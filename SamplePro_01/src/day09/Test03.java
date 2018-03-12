package day09;

import java.util.Date;

import day08.Book;

public class Test03 {

	public static void main(String[] args) {

		
		Animal a1 = new Dog();//추상메소드
		
		Object a2 = new Dog();
		//((String)a2).trim();
		//((Animal)a2).breath();
		
		if(a2 instanceof String)
			((String)a2).trim();
		
		
		if(a2 instanceof Animal)
			((Animal)a2).breath();
	
		Object d1 = new Dog();
		Animal d2 = new Dog();
		Dog d3 = new Dog();
		
		Book[] book;
		Animal animal;
		Dog[] dog;
		Object[] object;
		
		Object obj1 = new Date();
		Object obj2 = new Book();
		
		
		
	}

}
