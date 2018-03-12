package day05;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {

		int[] num; // 배열 선언
		num = new int[10]; // 배열 생성
		// 배열 초기화
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int data : num) {
			System.out.print(data+" ");
		}
		System.out.println();
		// 오름차순 정렬
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
//		for (int data : num) {
//			System.out.print(data+" ");
//		}
		System.out.println(Arrays.toString(num));
	}
}
