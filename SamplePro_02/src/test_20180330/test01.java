package test_20180330;

public class test01 {

	public static void main(String[] args) {

/*	문제 1)1~ N까지의숫자를 다음처럼 출력하라

	1 2 3 4 5

	6 7 8 9 10

	11 12 13 14 15*/
		
		int endNum = 15;
		for (int i = 0; i < endNum; i++) {
			System.out.print((i + 1) + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

	}

}
