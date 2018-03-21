package day14;

public class Test {

	public static void main(String[] args) {
		
		Member m = method();
		
		//4.반환된 객체를 출력
		m.print();
		//System.out.println("이름:"+m.getName()+" 나이:"+m.getAge()+" 키:"+m.getHeight());
	}
	
	static Member method(){
		
//		String name="홍길동";
//		int age = 89;
//		double height = 160.9;
		
		//2. 클래스에 데이터 지정
		//(1)생성자 지정
		//(2)setter 지정
		Member m = new Member();
		m.setAge(23);
		m.setHeight(160.3);
		m.setName("박보검");
		
		//3. 객체를 반환
		return m;
		
	}

}
//1. 클래스 선언
class Member{
	private String name;
	private int age;
	private double height;
	
	//기본생성자 -> 무조건 만들기
	public Member() {
		super();
	}

	public Member(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void print(){
		System.out.println("이름:"+getName()+" 나이:"+getAge()+" 키:"+getHeight());
	}
	
}


