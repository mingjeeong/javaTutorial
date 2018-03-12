package day05;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "고길동";
		s1.kor = 80;
		s1.math = 90;
		s1.eng = 100;
		s1.display();

		Student s2 = new Student();
		s2.name = "홍길동";
		s2.kor = 100;
		s2.math = 70;
		s2.eng = 60;
		s2.display();
		
	}

}
