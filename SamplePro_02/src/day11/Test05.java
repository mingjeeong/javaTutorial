package day11;

public class Test05 {

	public static void main(String[] args) {

		Employee emp1 = new Employee("�̹���","������");
		System.out.println(emp1);
	
		emp1.close();
		emp1 = null;
		
		//System.gc();//gcȣ��
	}

}
