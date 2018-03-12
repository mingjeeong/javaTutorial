package day10.task;

public abstract class Shape1 {

	private double area;
	private String name;
	
	public Shape1() {
		super();
	}
	

	public Shape1(double area) {
		super();
		this.area = area;
	}


	public Shape1(String name) {
		super();
		this.name = name;
	}


	public Shape1(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	
	
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void calculationArea();
	
	public abstract void print();
		
	


	
	
}
