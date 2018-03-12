package day04;

public class WhileTest {

	public static void main(String[] args) {

		String msg = "java test";
		
		for(int i = 5 ; i > 0 ; i--){
			System.out.println(msg);
		}
		
		System.out.println("==================");
		
		int i = 0;
		while(i<5){
			System.out.println(msg);
			i++;
		}
		
		System.out.println("==================");
		do{
			System.out.println("do wile test");
			i++;
		} while(i<5);
	}
}
