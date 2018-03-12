package day02;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);
		
		Date day = new Date("2018/04/01");
		System.out.println(day);
		
		int num1 = 40;
		int num2 = 50;
		
		int temp;
		temp = num1;
		num1 = num2;
		num2= temp;
		System.out.printf("num1=%d, num2=%d\n",num1,num2);
		
		System.out.printf("%5.2f\n",3.14*3*3);
		String name = "홍길동";
		System.out.printf("%10s님 \n",name);
		
		byte b= 0;
		b = (byte) 200;
		System.out.println(b);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		int sum = Integer.parseInt("100")+100;
		System.out.println(sum);
	}

}
