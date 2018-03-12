package day03;

public class TestFor {

	public static void main(String[] args) {

		for(int count = 0 ; count < 10 ; count++){
			System.out.println("hello java " + count);
		}
		
		int sum = 0;
		for(int num = 1 ; num < 101 ; num++){
			if(num % 3 == 0){ //3의 배수
				System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println("총 합계은: "+sum);
	}
}
