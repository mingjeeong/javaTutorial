package Test_0323;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] token = str.split(" ");
		int size = Integer.parseInt(token[0]);
		
		if(!(size>=1 && size<=1000)){
			System.out.println("범위 아웃");
			return;
		}
		
		int[] scores = new int[size];

		for (int i = 0; i < size; i++) {
			if(!(scores[i]<0 && scores[i]<100)){
				System.out.println("점수범위 아웃");
				return;
			}
			scores[i] = Integer.parseInt(token[i+1]);
			//System.out.println(scores[i]);
		}
		
		//평균 구하기
		int sum = 0;
		for(int i=0 ; i<size; i++){
			sum += scores[i];
		}
		int avg = sum/size;
//		System.out.println("평균:"+sum/size);
		
		//평균보다 넘는 갯수 구하기
		int count =0;
		for(int i=0; i<size; i++){
			if(scores[i] >= avg){
				count++;
			}
		}
//		System.out.println("count:"+count);
//		System.out.println(size);
		
		//퍼센트 구하기
		double p = ((double)count/size)*100;
		System.out.println(">>"+Math.round(p*1000)/1000.0);
	}
}

