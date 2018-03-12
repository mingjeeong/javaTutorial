package day07;

import util.MyMath;

public class MyMathTest {

	public static void main(String[] args) {

		//System.out.println(MyMath.add(10,20));
		System.out.println(MyMath.substract(40,20));
		System.out.println(MyMath.divide(40,20));
		System.out.println(MyMath.divide(40,0));
		
		System.out.println("========================");
		//System.out.println(MyMath.add(1 , 2));
		System.out.println(MyMath.add(new int[]{1 , 2, 3}));
	}

}
