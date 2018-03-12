package day06;


public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name ="홍길동";
		//s1.sungjuk = new int[] {90,80};//문법
		s1.setSungjuk(new int[] {90,80});
		
		Student s2 = new Student();
		s2.name ="고길동";
		//s2.sungjuk = new int[] {50,80};
		s2.setSungjuk(new int[] {90,80});
		
		Student s3 = new Student();
		s3.name ="김길동";
		//s3.sungjuk = new int[] {87,75};
		s3.setSungjuk(new int[] {90,80});
		
		Student[] students = {s1,s2,s3};
		for(int i = 0 ; i < students.length;i++){
			students[i].print();
		}
//		
		//s1.print();
		
//		s1.calAvg();
//		System.out.println(s1.avg);
		//System.out.println(s1.calAvg());
//		System.out.println(s1.calGrade());
		
		//s1.print();
		
	}

}
