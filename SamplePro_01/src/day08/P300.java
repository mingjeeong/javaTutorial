package day08;

public class P300 {
	
	int x = 999;
	int y = x;
	static double pi = 3.14;

	public static void main(String[] args) {

		int x = 9;
		int y = x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(new P300().x);
	}

}
