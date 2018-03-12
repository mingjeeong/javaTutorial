package day08;

public class BookMgr {

	Book2[] booklist;
	int count = 0;
	

	
	public BookMgr() {
		super();
	}


	public BookMgr(Book2[] booklist) {
		super();
		this.booklist = booklist;
	}
	
	public void add(Book2 book){
			booklist[count] = book;
			count++;
	}
	
	public void printBookList(){
		System.out.println("===책 목록===");
		for(int i = 0 ;i < count ; i++){
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int total = 0;
		System.out.println("===책 가격의 총합===");
		for(int i = 0 ; i <count ; i++){
			total = total +booklist[i].getPrice();
		}
		System.out.println(total);
		
	}
	
	
	
}
