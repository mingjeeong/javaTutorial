package day11;

import java.util.Date;

public class Test03 {
	public static void main(String[] args) {

		Object[] obj = {
				"Hello",
				new Employee("ȫ�浿","��������"),
				new Date()
		};
		
		for(int i = 0; i<obj.length; i++){
			System.out.println(obj[i]);
		}
		
		System.out.println(obj[0].equals(obj[1]));
	}
}
