package day04;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("******전화번호부*****");
		Scanner keyboard = new Scanner(System.in);
		
		while(true){
			System.out.println();
			System.out.println("메뉴를 선택하세요. ex)1");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println();
			
			String choice = keyboard.nextLine();
			
			switch(choice){
			case "1":
				System.out.println("1. 데이터 입력");
				System.out.println("처리중...");
				break;
			case"2":
				System.out.println("2.회원목록보기");
				System.out.println("처리중...");
				break;
			case "3":
				System.out.println("3. 회원 조회");
				System.out.println("처리중...");
				break;
			case"4":
				System.out.println("4. 프로그램 종료");
				System.out.println("처리중...");
				//return; //수행중인 함수 종료
				System.exit(0);//application 종료
			}
		}
	}
}
