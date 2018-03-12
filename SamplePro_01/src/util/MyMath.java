package util;

public class MyMath {
	
/*	public static int add(int... num) {// 가변인자
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}*/
	public static int add(int[] num) {//
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	

/*	public static int add(int num1, int num2){
		return num1 + num2;
	}
	
	public static int add(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}*/
	
	public static int substract(int num1, int num2){
		return num1 - num2;
	}
	
	public static int multiple(int num1, int num2){
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2){
		if(num2 == 0){
			return -1;
		}
		return num1 / num2;
	}
	
}
