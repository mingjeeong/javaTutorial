package test_20180330;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {

/*	문제4) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을작성하시오.

	입력

	3  4

	출력

	1 2 3 4

	2 4 6 8

	3 6 9 12*/
		
		System.out.println("행과 열의 수를 순서대로 입력하시오 ex)3 4");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] array = str.split(" ");
		int row = Integer.parseInt(array[0]);
		int col = Integer.parseInt(array[1]);

		for (int j = 0; j < row * col; j++) {
			System.out.print((j + 1) + " ");
			if ((j + 1) % col == 0) {
				System.out.println();
			}
		}
		
			
		
	
	}

}
