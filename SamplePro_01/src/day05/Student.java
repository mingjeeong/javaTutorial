package day05;

public class Student {

	String name = null;
	int kor ;
	int math ;
	int eng ;
	
	public void display(){
		System.out.printf("이름 : %s, 국어 : %d, "
				+ "수학 : %d, 영어 : %d %n"
				,name,kor,math,eng);
		return ;
	}
}
