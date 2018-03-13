package day11;

public class Employee {

	private String name;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return name+"�� "+dept+"�μ��Դϴ�";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean flag = false;
		
		if(!(obj instanceof Employee)){
			return flag;
		}
		
		Employee target = (Employee)obj;
		
		if(name.equals(target.name) && dept.equals(target.dept)){
			flag = true;
		}
		
		return flag;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize()���� �ڿ��ݳ�...");
	}
	
	public void close(){
		System.out.println("�ڿ��ݳ�...");
	}

	
}
