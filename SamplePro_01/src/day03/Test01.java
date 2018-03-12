package day03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		System.out.println("성적처리");
		String name = null;
		int score = 0;
		char grade = ' ';
		
		Scanner input = new Scanner(System.in);
//		System.out.println("성적처리를 원하면 y를 종료하려면 q를 입력해주세요");
//		String quit = input.nextLine();
		
	
		System.out.println("이름을 입력하시오");
		name = input.nextLine();
		//유효성검사
		if(name.trim().length() == 0 || name == null){
			System.out.println("이름을 입력하지 않았습니다.");
			return;
		}
			
		System.out.println("점수를 입력하시오. ex)70");
		score = input.nextInt();
		input.nextLine();
		
		if(score > 100 || score < 0){
			System.out.println("점수의 범위가 맞지 않습니다.");
			return;
		}
		//성적처리
		if(score >=90 && score<=100){
			grade ='A';
			System.out.println("참 잘하셨어요.");
		}else if(score>=80 && score<90){
			grade = 'B';
			System.out.println("열심히 하셨네요.");
		}else if(score>=70 && score<80){
			grade = 'C';
			System.out.println("조금만 더 노력하세요");
		}else if(score>=60 && score<70){
			grade = 'D';
			System.out.println(".");
		}else{
			grade ='F';
			System.out.println("재시험입니다.");
		}
		
		System.out.println("이름 : "+name+", 점수 : "+score+", 등급 : "+grade);
			
		
	}
}
