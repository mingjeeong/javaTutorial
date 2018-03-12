package day02;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		String name = null;
		int age = 0;
		int num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하시오.");
		//age = Integer.parseInt(scan.nextLine());
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("당신의 이름을 입력하시오");
		name = scan.nextLine();
		System.out.println(name+"님의 나이는 "+age+"살 입니다.");



		

	
	}
}
