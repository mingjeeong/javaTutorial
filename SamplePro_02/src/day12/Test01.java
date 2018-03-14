package day12;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		String[] names = {"홍길동","고길동","김길동","최길동","박길동"};
		
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Employee[] emps = {
				new Employee("홍길동","기획부"),
				new Employee("고길동","경영지원부"),
				new Employee("김길동","영업부"),
				new Employee("밤길동","마케팅부"),
		};
		

		System.out.println(Arrays.toString(emps));
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));//error
		
	}

}
