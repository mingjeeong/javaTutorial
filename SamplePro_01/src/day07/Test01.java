package day07;

public class Test01 {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.print();
		
		Card c2 = new Card();
		c2.print();
		
		String msg = new String("hello");
		System.out.println(msg);
		
		System.out.println("==============");
		Car c3 = new Car("black","auto",4);
		c3.print();
	}

}
