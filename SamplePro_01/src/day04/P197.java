package day04;

import java.util.Arrays;

public class P197 {

	public static void main(String[] args) {

		int[] score = new int[5];
		
		//System.out.println(Math.random()*100+1);
		
		for(int i = 0 ; i < score.length; i++){
			score[i] = (int)(Math.random() * 100) + 1;
		}
		
		//System.out.println(score); //주소값
		
		//배열출력을 담당하는 API
		 System.out.println(Arrays.toString(score));
		 
		 //MAX값 구하기
		 int max = 0;

		 for(int i = 0 ; i < score.length ; i++){
			 if(max < score[i]){
				 max = score[i];
			 }
		 }
		 System.out.println("최대값 : "+max);
	}
}
