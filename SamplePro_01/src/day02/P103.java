package day02;

import java.util.Scanner;

public class P103 {

	public static void main(String[] args) {
//
//		char c1 ='a';
//		char c2 = c1;
//		char c3 = 'A';
//		
//		System.out.printf("c1 = %c, c2=%c,c3=%c\n",c1,c2,c3);
//		
//		System.out.println(c1+1);
//		System.out.println(c3+1);
//		String s = c1+"";
//		System.out.println(s.toUpperCase());
//		
//		System.out.println((char)(c1-32));
//		System.out.println("_______________________");
//		c1 = 'a';
//		
//		for(int i = 0 ; i < 26 ; i++){
//			System.out.println((char)(c1++));
//		}
//		
		char c ='d';
		Scanner input = new Scanner(System.in);
		if(97 <= c && c <= 122){
			System.out.printf("%c는 소문자입니다.",c);
		}
	
		if(c>='0' && c<='9'){
			System.out.println("c는 숫자입니다");
		}
		
		if(c>=65 && c<=90){
			System.out.println("대문자입니다.");
		}
	}

}
