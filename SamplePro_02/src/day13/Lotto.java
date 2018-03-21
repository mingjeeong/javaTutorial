package day13;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto;
		lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++){
			lotto[i] = (int) (Math.random()*45+1);//1~45
		}
		
		//3. 중복숫자 배제
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("중복");
					lotto[j] = (int) (Math.random() * 45 + 1);
				}
			}
		}
		
		for(int i = 0 ; i< lotto.length;i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//1. 총 합이 106 에서 170사이면 좋은번호라고 출력
		int sum =  0;
		for(int i = 0; i<lotto.length; i++){
			sum += lotto[i];
		}
		if(sum >= 106 && sum <= 170){
			System.out.println(sum + "좋은 번호");
		}
		
		//2. 버블정렬
//		for(int i = lotto.length-1; i > 0; i--){
//			for(int j = 1; j <= i; j++){
//				if(lotto[j-1] > lotto[j]){
//					int temp = lotto[j-1];
//					lotto[j-1] = lotto[j];
//					lotto[j] = temp;
//				}
//			}
//		}
		for(int i = lotto.length-1; i > 0; i--){
			for(int j = 0; j <= i-1; j++){
				if(lotto[j] > lotto[j+1]){
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));	
		
		
		
		
	
		
		
		
		
	}
		

}
