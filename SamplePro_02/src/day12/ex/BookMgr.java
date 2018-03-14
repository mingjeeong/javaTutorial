package day12.ex;

import java.util.Arrays;

import day12.Employee;

public class BookMgr {
	
	private Book[] booklist;
	int count = 0;

	
	public BookMgr() {
		booklist = new Book[10];
	}

	public BookMgr(int size) {
		booklist = new Book[size];
	}

	public Book[] getBook() {
		return booklist;
	}

	public void setBook(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(Book book){
		if(count == booklist.length){
			Book[] temp = new Book[booklist.length * 2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		
		booklist[count] = book;//증복체크
		count++;
		
		

	}
	
	
	
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		for(int i = 0; i < count; i++){
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public int printTotalPrice(){
		int sum =0;
		System.out.println("=== 책가격의 총합 ===");
		for(int i = 0 ; i < count;i++){
			sum = sum + booklist[i].getPrice();
		}
		return sum;
	}
	public void print(){//가격순으로 정렬해서 뿌리기//arrays.sort사용
		for(int i = 0 ; i<count ;i++){
			//booklist[i].print();
			Arrays.sort(booklist);
			booklist[i].toString();
		}
	}
	
	public void searchBook(String title){
		System.out.println("=== 검색 기능 ===");
		for(int i = 0 ; i<count ; i++){
			//if(booklist[i].getTitle().equals((title.trim()))){
			if(booklist[i].getTitle().contains(title.trim())){
				//booklist[i].print();
				booklist[i].toString();
			}
		}
		
	}



	
}
