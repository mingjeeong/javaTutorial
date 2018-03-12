package day01;

public class SampleTest2 {

	public static void main(String[] args) {

		int money = (int)500.5;
		money = money + 700;
		System.out.println("money : "+ money);
		System.out.println(300+300+300+"원");
		System.out.println("원 : "+300+300+300);
		
		double pi = 3.14;
		System.out.println(pi);
		System.out.println(Math.PI);
		
		System.out.println("반지름이 3인 원의 면적은 "+pi*3*3);
		
		String name = new String("lee min jeong");
		System.out.println(name.charAt(1));
		System.out.println(name.toUpperCase());
	}

}
