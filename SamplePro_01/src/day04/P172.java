package day04;

import java.util.Scanner;

public class P172 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			System.out.println("----------------------------------");
			System.out.println("등급을 처리할 점수를 입력해주세요.");
			System.out.println("종료하려면 q를 입력하세요");
			String data = scan.nextLine();
			
			if(data.equals("q")){
				System.out.println("프로그램 종료합니다..");
				break;
			}
			
			int jumsu = Integer.parseInt(data);
			String grade = jumsu >= 80 ? "합격" : "불합격";
			
			System.out.printf("%d점은 [%s]입니다. %n",jumsu,grade);
					
		}
	}

}
