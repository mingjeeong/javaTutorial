package test_20180330;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {

/*	문제 5) 정수 20 개를 입력받아서 그 합과 평균을 출력하되 
	0 이 입력되면 20개 입력이 끝나지 않았더라도 
	그 때까지 입력된합과 평균을 출력하는 프로그램을 작성하시오. 
	평균은 소수부분은 버리고 정수만 출력한다.
	(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

	입력
	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
	5 9 6 8 4 3 0
	5 9 6 8 4 3 0 5 6 0
	출력
	35 5
*/	
		System.out.println("정수 20 개를 띄어쓰기로 연결하여 입력하시오.");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String[] array = str.split(" ");
		int count =array.length;
		
		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) == 0) {
				count = i;
				break;
			}
		}
		
		int sum =0; 
		
		for (int i = 0; i < count; i++) {
			sum += Integer.parseInt(array[i]);
		}

		System.out.println(sum+" "+sum/count);
		
		
		
		
	}

}
