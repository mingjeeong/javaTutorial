package day14;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] tokens = null;
		
		System.out.println("입력할 학생 수를 입력하세요");
		int count = input.nextInt();
		input.nextLine();
		Student[] s = new Student[count];
		
		for(int i = 0; i < count; i++){
			System.out.println((i+1)+"째 학생의 성적을 입력->");
			String str = input.nextLine();
			tokens = str.split(" ");
			for(int j = 0 ; j < tokens.length; j++){
				s[i] = new Student(tokens[0],tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]));
			}
		}
		
		for(int i = 0 ; i < count; i++){
			System.out.println((i+1)+"번째 학생의 총점은 "+s[i].calcsum()+"평균은 "+s[i].calcAvg()+"입니다");
		}
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		for(int i = 0; i < count; i++){
			korSum +=s[i].getKor();
			engSum +=s[i].getEng();
			mathSum +=s[i].getMath();
		}
					
		System.out.println("국어과목 총점은"+korSum+"이고 평균은 "+(korSum/count)+"입니다.");
		System.out.println("영어과목 총점은"+engSum+"이고 평균은 "+(engSum/count)+"입니다.");
		System.out.println("수학과목 총점은"+mathSum+"이고 평균은 "+(mathSum/count)+"입니다.");

//		Student s = new Student("111","홍길동",90,90,90);
//		System.out.println(s.calcsum());
//		System.out.println(s.calcAvg());
		
//		1001 홍길동 88 77 66
//		2002 홍길자 50 40 70
//		3003 홍길숙 44 33 22
	}
}
