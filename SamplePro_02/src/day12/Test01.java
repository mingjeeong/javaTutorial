package day12;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		String[] names = {"ȫ�浿","��浿","��浿","�ֱ浿","�ڱ浿"};
		
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Employee[] emps = {
				new Employee("ȫ�浿","��ȹ��"),
				new Employee("��浿","�濵������"),
				new Employee("��浿","������"),
				new Employee("��浿","�����ú�"),
		};
		

		System.out.println(Arrays.toString(emps));
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));//error
		
	}

}
