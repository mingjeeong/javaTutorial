package day02;

public class Task {

	public static void main(String[] args) {

		int score = 10;
		boolean flag = (score >= 80);
		char c = flag ? 'o' : 'x';
		
		if(score <= 0 || score >= 100){
			System.out.println("데이터 입력오류");
			return;
		}
		
		System.out.println(c);
		System.out.println(score+"가 80보다 넘나요 ? "+flag);
		
		
	}

}
