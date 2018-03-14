package day12;

public class PersonInfoTest {

	public static void main(String[] args) {

		PersonInfo<String> p1 = new PersonInfo<String>("ȫ�浿","2018");
		System.out.println(p1);
		
		PersonInfo<Integer> p2 = new PersonInfo<Integer>("ȫ�浿",2017);
		System.out.println(p2);
	
		PersonInfo p3 = new PersonInfo("�ڱ浿",2015);//Object
		System.out.println(p3);
		}

}
