package day08;

public class P306 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.print();
		p2.print();
		p3.print();
	}
}

class Product{
	static int count;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	
	void print(){
		System.out.println("Product No:"+serialNo);
	}
}
