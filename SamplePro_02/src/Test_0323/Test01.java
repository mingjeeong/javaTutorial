package Test_0323;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		int size = str.length();
		char[] result = new char[size];

		//result배열에 스트링값 넣기
		for (int i = 0; i < size; i++) {
			result[i] = str.charAt(i);
		}

		//System.out.println(">>" + Arrays.toString(result));

		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 'O' || result[i] == 'o') {
				count++;
				sum += count;
					
			} else if (result[i] == 'X' || result[i] == 'x') {
				sum += 0;
				count = 0;
			}
		}

		System.out.println(sum);
	}

}
