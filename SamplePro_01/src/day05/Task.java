package day05;

import java.util.Arrays;
import java.util.Random;

public class Task {

	public static void main(String[] args) {
//		3월 5일
//		1. int[] num = new int[6]
//		   배열 num에 정수 1~45 사이의 난수를 집어넣는다.
//		   중복제거한다.
//		   정렬후 화면에 출력한다.
		
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) ((Math.random() * 45) + 1);
			for(int j = 0 ; j<i ; j++){
				if(num[i]==num[j]){
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i<num.length-1; i++){
			for(int j = i ; j<num.length;j++){
				if(num[i] > num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i : num){
			System.out.print(i+" ");
		}
	}
}
