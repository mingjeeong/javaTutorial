package day12.ex;

public class BookApplication {

	public static void main(String[] args) {

		BookMgr mgr = new BookMgr(5);
		Book b1 = new Book("java programming",100);
		mgr.addBook(b1);
//		mgr.addBook(new Book("sql",200));
//		mgr.addBook(new Book("sql",200));
//		mgr.addBook(new Book("servlet",400));
//		mgr.addBook(new Book("jsp",500));
//		mgr.addBook(new Book("jdbc",600));
		
		mgr.printBookList();
		System.out.println(mgr.printTotalPrice()+"원");
		
		mgr.searchBook("ddd");
		
		//mgr.print();
	}

}
