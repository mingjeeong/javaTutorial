package day09;

public class Person {

	private int age ;
	private String name;
	
	public Person() {
		super();
		System.out.println("person 생성자");
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("person(int,String) 생성자");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println(name+" "+age);
	}
	
	
	
}
