package day08;

public class Book {
	String title;
	int price;
	String author;
	
	public Book(){
		
	}
	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	public Book(String title, int price, String author){
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setPrice(int price){
		if(price <0){
			System.out.println("error");
		}
		this.price = price;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	
	
	public String getTitle(){
		return title;
	}
	
	public int getPrice(){
		return price;
	}
	public String getAuthor(){
		return author;
	}
	public void print(){
		System.out.println("title:"+title+" price:"+price+" author:"+author);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("자바프로그래밍",300);
		b1.print();
		
		Book b2 = new Book("spring",400,"이민정");
		b2.print();
		
	}

}
