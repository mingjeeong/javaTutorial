package day11;

public class Test04 {

	public static void main(String[] args) {
		Student s1 = new Student("고길동",20180313);
		Student s2 = new Student("고길동",20180313);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals("###"));
		
		System.out.println(s1.getClass());
		System.out.println("".getClass());
	}
}
