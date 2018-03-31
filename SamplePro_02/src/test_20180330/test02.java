package test_20180330;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {

/*	문제2) 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 
	모두 3.0 이상이면 "B", 
	아니면 "C" 라고 출력하는프로그램을 작성하시오.*/
		boolean flag = true;
		int num1 = 0;
		int num2 = 0; 
		int sum =0;
		while(flag){
			
			System.out.println("첫번째 점수를 입력하시오.");
			Scanner input1 = new Scanner(System.in);
			num1 = input1.nextInt();
			input1.nextLine();
		
			System.out.println("두번째 점수를 입력하시오.");
			Scanner input2 = new Scanner(System.in);
			num2 = input2.nextInt();
			input2.nextLine();
			if(num1>4|| num2>4){
				System.out.println("0부터 4사이의 점수 입력하시오");
				continue;
				
			}
			sum = num1 + num2;
			if (sum >= 8) {
				System.out.println("A");
			} else if (sum >= 6) {
				System.out.println("B");
				
			} else {
				System.out.println("C");
			}
			
			break;
		}


		
	}

}
