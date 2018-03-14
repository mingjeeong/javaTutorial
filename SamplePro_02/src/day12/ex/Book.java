package day12.ex;

public class Book implements Comparable<Book>{
	
	private String title;
	private int price;
	
	public Book() {
		super();
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)){
			return false;
		}
		Book book = (Book)obj;
		if(book.title.equals(book.title) && book.price == price){
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Book o) {
		return (price+"").compareTo(o.price+"");
	}
	

	
	

	
	
	

}
