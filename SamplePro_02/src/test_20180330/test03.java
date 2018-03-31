package test_20180330;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		
/*	문제3) 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 
 * 각각 구하여 출력하는 프로그램을 작성하시오.

	입력
	10 20 30 55 66 77 88 99 100 15
	출력
	짝수 : 6개
	홀수 : 4개*/
		
		System.out.println("10개의 정수를 입력하시오. ex)10 20 30 55 66 77 88 99 100 15");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] data = str.split(" ");
		
		int even = 0;// 짝수갯수
		int odd = 0;// 홀수갯수
		
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i]) % 2 == 0) {
				even++;
			} else {
				odd++;

			}
		}
		
		System.out.println("짝수 : "+even+"개");
		System.out.println("홀수 : "+odd+"개");
		
	}
}
