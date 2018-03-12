package day04;

public class ArrayTest {

	public static void main(String[] args) {

		int[] jumsu = null;
		jumsu = new int[5];
		char[] grade = new char[jumsu.length];
		String[] name = {"홍길동", "김길동", "최길동", "고길동", "이길동"};
		
		System.out.println(jumsu.length);
		
		jumsu[0] =80;
		jumsu[1] =70;
		jumsu[2] =100;
		jumsu[3] =50;
		jumsu[4] =35;
	
//		System.out.println(jumsu[0]); //코드중복
//		System.out.println(jumsu[1]);
//		System.out.println(jumsu[2]);
//		System.out.println(jumsu[3]);
//		System.out.println(jumsu[4]);
		
		for(int index = 0 ; index < jumsu.length ; index++){
//			char grade = jumsu[index] >= 90 ? 'A': jumsu[index] >= 80 ? 'B' : jumsu[index] >= 70 ? 'C' :
//				jumsu[index] >= 60 ? 'D' : 'F';
			grade[index] = jumsu[index] >= 90 ? 'A': jumsu[index] >= 80 ? 'B' : jumsu[index] >= 70 ? 'C' :
				jumsu[index] >= 60 ? 'D' : 'F';
			System.out.println(name[index].charAt(0)+"씨의 점수는 "+jumsu[index]+"점이고 "+grade[index]+"학점입니다.");
		}
	}
}
