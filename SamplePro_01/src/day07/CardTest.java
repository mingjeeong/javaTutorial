package day07;

public class CardTest {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.kind = "spade";
		c1.number = 10;
		
		Card c2 = new Card();
		c2.kind ="heart";
		c2.number = 7;
		
		c1.print();
		c2.print();
		
	}

}
