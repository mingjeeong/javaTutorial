package day05;

import java.util.Arrays;
import java.util.Scanner;

public class P212 {

	public static void main(String[] args) {

		String[] msg = {};
		//System.out.println(msg.length); //null 아님
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
//		msg = input.split(" ");
//	
//		System.out.println(Arrays.toString(msg));
		
//		System.out.println(args.length);
//		System.out.println(Arrays.toString(args));
		
		//int[][] i = new int[4][3];
		
//		int[][] i = new int[4][];
//		i[0] = new int[3];
//		i[1] = new int[1];
//		i[2] = new int[7];
//		i[3] = new int[4];
		
		//int[][] i = {{55,49,80},{78,97,100},{90}};
		//String[][] i = {{"사과","배","자두"},{"멜론","수박","귤"},{"한라봉"}};
		String[][] i = {{"홍길동","90","80","65"},
						{"김길동","50","88","100"},
						{"고길동","90","67","89"},
						};
//		System.out.println(i[0][0]);
//		System.out.println(i[0][1]);
//		System.out.println(i[0][2]);
//		System.out.println(i[1][0]);
//		System.out.println(i[1][1]);
//		System.out.println(i[1][2]);
//		System.out.println(i[2][0]);
//		System.out.println(i[2][1]);
//		System.out.println(i[2][2]);
//		System.out.println(i[3][0]);
//		System.out.println(i[3][1]);
//		System.out.println(i[3][2]);
		
		System.out.println("이름        국어      수학      영어      총점");
		for (int k = 0; k < i.length; k++) {
			int sum = 0;
			
			for (int j = 0; j < i[k].length; j++) {
				if(j != 0){
					sum += Integer.parseInt(i[k][j]);
				}
				System.out.printf("%5s ",i[k][j]);
			}
			System.out.printf("%3d %n",sum);
		}
	}
}
