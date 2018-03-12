package day07;

public class Card {

	int number;
	String kind;
	
	static int width = 7;
	static int height = 15;
	
	public Card(){
		System.out.println("Card() 호출");
	}

	
	public void print(){
		System.out.println("카드의 종류:"+kind+" 카드 숫자:"+number+" 폭:"+width+" 높이:"+height);
	}
}
