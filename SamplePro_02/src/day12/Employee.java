package day12;

public class Employee implements Comparable<Employee>{

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
		return name+":"+dept;
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
		System.out.println("finalize()¼öÇà ÀÚ¿ø¹Ý³³...");
	}
	
	public void close(){
		System.out.println("ÀÚ¿ø¹Ý³³...");
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
	}

	
}
