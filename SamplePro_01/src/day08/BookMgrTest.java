package day08;

public class BookMgrTest {

	public static void main(String[] args) {

		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		Book2 b3 = new Book2();
		Book2 b4 = new Book2();
		Book2 b5 = new Book2();
		b1.setTitle("Java Program");
		b1.setPrice(100);
		b2.setTitle("JSP Program");
		b2.setPrice(100);
		b3.setTitle("SQL Fundamentals");
		b3.setPrice(100);
		b4.setTitle("JDBC Program");
		b4.setPrice(100);
		b5.setTitle("EJB Program");
		b5.setPrice(100);
		
		BookMgr bm = new BookMgr(new Book2[100]);
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		bm.add(b5);
		
		bm.printBookList();
		bm.printTotalPrice();
		
	}

}
