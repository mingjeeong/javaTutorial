package oop;

public class InnerTest {

	public static void main(String[] args) {

		//Outer o = new Outer();
		//Outer.Inner i = o.new Inner();
		
		//Outer.Inner i = new Outer.Inner();
		//i.a();
		
		Outer.Inner.a();
	}

}

class Outer{
	static class Inner{//static
		static void a(){//static
			System.out.println("쥐를잡자");
		}
	}
}
