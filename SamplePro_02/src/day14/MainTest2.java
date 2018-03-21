package day14;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		Model m = new Model();
		try {
			m.method();
			System.out.println(">>>");
		} catch (Exception e) {
			System.out.println("예외발생 "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
		
	}

}
class Model{
	public void method() throws Exception {
		//두수 입력받아 첫번째 수를 두번째수로 나누기
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오.");
		int num1 = s.nextInt();
		
		System.out.println("두번째 수를 입력하시오.");
		int num2 = s.nextInt();
		if(num2 == 0) throw new MyException();//throws아님
		int result = num1 / num2;
		
		
	}
}

class MyException extends Exception{
	public String getMessage(){
		return "두번째 수가 0이면 안됨";
	}
}
