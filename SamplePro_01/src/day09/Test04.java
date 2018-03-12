package day09;

public class Test04 {

	public static void main(String[] args) {

		Fish f = new Fish("물고기과","금붕어");
		System.out.println(f.kind);
		f.breath();
		System.out.println("====================");
		Animal f2 = new Fish("물고기과","금붕어");
		System.out.println(f2.kind);
		f2.breath();
	}

}
