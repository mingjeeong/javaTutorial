package day11;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		Employee emp1 = new Employee("ȫ�浿","��ȹ��");
		Employee emp2 = new Employee("ȫ�浿","��ȹ��");
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(emp1.equals(emp2));//false
		
	}
}
