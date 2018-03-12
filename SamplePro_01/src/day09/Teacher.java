package day09;

public class Teacher extends Person{

	private String subject;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, int age, String subject) {
		super(age,name);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void print(){
		System.out.printf("이름:%s, 나이 :%d, 과목 :%s",super.getName(),super.getAge(),subject);
	}
	
}
