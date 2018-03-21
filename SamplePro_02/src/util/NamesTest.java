package util;

public class NamesTest {

	public static void main(String[] args) {

		for(Names n : Names.values()){
			System.out.println(n);
			System.out.println("직업:"+n.getJob());
			System.out.println("급여:"+n.salary());
		}
	}

}
