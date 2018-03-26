package day13;

import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {

		//이차열배열 사용
		int[][] lotto;
		
		Scanner input = new Scanner(System.in);
		System.out.println("갯수 입력:");
		int size = input.nextInt();
		input.nextLine();
		
		lotto = new int[size][6];
		
		//랜덤값지정
		for(int i = 0; i < lotto.length; i++){
			for(int j=0;j<lotto[i].length;j++){
				lotto[i][j] = (int) (Math.random()*45+1);//1~45
			}
		}
		
		//배열 출력
		for(int i=0;i<lotto.length;i++){
			System.out.print("["+(i+1)+"]");
			for(int j =0; j<lotto[i].length;j++){
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//3. 중복숫자 배제
		for(int k=0;k<lotto.length;k++){
			for (int i = 0; i < lotto[k].length - 1; i++) {
				for (int j = i + 1; j < lotto[k].length; j++) {
					if (lotto[k][i] == lotto[k][j]) {
						//System.out.println("중복");
						lotto[k][j] = (int) (Math.random() * 45 + 1);
					}
				}
			}
		}
	
		System.out.println("===============================");
		//1. 총 합이 106 에서 170사이면 좋은번호라고 출력
		int[] sum =  new int[size];
		for(int i = 0; i<lotto.length; i++){
			for(int j=0;j<lotto[i].length;j++){
				
				sum[i] += lotto[i][j];
			}
		}
		for(int i =0; i<sum.length;i++){
			if(sum[i] >= 106 && sum[i] <= 170){
				System.out.println("["+(i+1)+"]"+sum[i] + "좋은 번호");
			}
		}
		
		//2. 버블정렬
		for(int k=0;k<lotto.length;k++){
			for(int i = lotto[k].length-1; i > 0; i--){
				for(int j = 0; j <= i-1; j++){
					if(lotto[k][j] > lotto[k][j+1]){
						int temp = lotto[k][j];
						lotto[k][j] = lotto[k][j+1];
						lotto[k][j+1] = temp;
					}
				}
			}
		}

		System.out.println("==============정렬후============");
		for(int i=0;i<lotto.length;i++){
			System.out.print("["+(i+1)+"]");
			for(int j =0; j<lotto[i].length;j++){
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
	}
}
