package test_20180406;

import java.util.Scanner;

public class starTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("갯수와 타입 입력 ex)3 2");
		String str = s.nextLine();
		String[] input = str.split(" ");
		int count = Integer.parseInt(input[0]);
		int type = 	Integer.parseInt(input[1]);	
		
		System.out.println("count:" +count);
		System.out.println("type:" +type);
		
		switch(type){
		case 1:
			one(count);
			break;
		case 2:
			two(count);
			break;
		case 3:
			three(count);
			break;
		default :
			System.out.println("타입은 1부터 3사이의 자연수만 가능");
		}
		
	
		
	}

	public static void one(int count) {

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void two(int count) {
		for (int i = 0; i < count; i++) {
			for (int j = count; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void three(int count){
		for(int i=count; i<0;i++){
			for(int j=0; j<2*count-1 ; j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
