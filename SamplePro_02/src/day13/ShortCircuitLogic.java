package day13;

public class ShortCircuitLogic {

	public static void main(String[] args) {

		int a = 3;
		if(a>3 & ++a>3){
			System.out.println("조건에 만족합니다.");
		}
		
		System.out.println(a);
		
		if(a>1 || ++a>3){
			System.out.println("조건만족2222");
		}
	
		System.out.println(a);
	}

}
