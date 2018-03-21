package Collection;

public class Student extends Object{

	String name;
	int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public String toString(){
		return name+"님은 "+age+"세 입니다.";
	}
	
}
