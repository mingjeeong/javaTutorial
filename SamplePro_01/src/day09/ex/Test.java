package day09.ex;

public class Test {

	public static void main(String[] args) {

		Student s = new Student("홍길동",20,20180312);
		s.print();
		
		Teacher t = new Teacher("이민정",30,"수학");
//		t.setAge(30);
//		t.setName("이민정");
//		t.setSubject("수학");
		t.print();
		
		Employee e = new Employee("고길동",30,"행정학과");
		e.print(); 
	}

}

class Person extends Object{
	private String name;
	private int age;
	
	
	public Person() {}
	public Person(String name, int age) {
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
	public void print(){
		System.out.println(name+" "+age);
	}
	
	
	
	
}

class Student extends Person{
	private int id;

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){
		System.out.printf("student[%s %d %d]",getName(),getAge(),id);
		System.out.println();
	}
	
	
	
	
	
}
class Teacher extends Person{
	private String subject;
	
	
	
	public Teacher() {
		super();
	}



	public Teacher(String name, int age, String subject) {
		super(name,age);
//		setName(name);
//		setAge(age);     
		this.subject = subject;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public void print(){
		System.out.printf("teacher[%s %d %s]",getName(),getAge(),subject);
		System.out.println();
	}
	
	
}
class Employee extends Person{
	private String dept;
	
	
	
	public Employee() {
		super();
	}



	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	

	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}



	public void print(){
		System.out.printf("employee[%s %d %s]",getName(),getAge(),dept);
		System.out.println();
	}
}
