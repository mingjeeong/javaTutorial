package day03;

public class P147 {

	public static void main(String[] args) {

		System.out.println("성적처리");
		String name =null;
		int score = 0;
		char grade = ' ';
		name = "홍길동";
		score = 44;
		
		if(name == null || name.length() ==0 || score > 100 || score < 0){
			System.out.println("입력정보가 정확하지 않습니다.");
			System.out.println("성적처리 종료");
		}
		//등급처리 switch
		switch(score/10){
			case 9:
				grade ='A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default :
				grade = 'F';
				break;
		}
		switch(grade){
			case 'F' :
				System.out.println("경고입니다.");
				break;
		}
		
		System.out.println(name+"님의 성적은 "+score+"점,등급은 "+grade+"입니다.");
		System.out.println("성적처리 종료");
		
	}

}
