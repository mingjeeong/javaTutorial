package day12;

public class InnerClassTest {

	public static void main(String[] args) {
		A a = new A();
//		a.p();
//		a.print();
		
		//B b; //ERROR
		//A.B b;
		//A.B b = new B(); //ERROR
		
		A.B b = new A().new B();
		b.bp();
//		
//		A.S s = new A.S();
//		s.sp();
	}
}

class A{
	String name="A";
	void p(){
		System.out.println("����� A");
		System.out.println(name);
	}
	void print(){
		new B().bp();
		new S().sp();
	}
	class B{
		String name = "B";
		void bp(){
			System.out.println("����� A�ȿ� B");
			System.out.println(name);//B
			System.out.println(this.name);//B
			System.out.println(A.this.name);//A
		}
	}
	
	static class S{
		void sp(){
			//System.out.println(name+"!!!");//name ���ٺҰ�
			System.out.println("!!!");
		}
	}
} 
/*class B{
	void bp(){
		System.out.println(name);//name ���ٺҰ�
	}
}*/