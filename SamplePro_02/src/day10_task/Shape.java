package day10_task;

public abstract class Shape {

	protected double area;
	private String name;
	
	
	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
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
	
	public void print(){
		System.out.println(name+"의 면적은"+area);
	}
}

class Circle extends Shape{
	double redius;
	
	public Circle() {
		super();
	}

	public Circle(String name, double redius) {
		super(name);
		this.redius = redius;
	}

	public void calculationArea(){
		this.area = Math.PI*redius*redius;
	}
}

class Rectangle extends Shape{
	double w,h;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name, double w, double h) {
		super(name);
		this.w = w;
		this.h = h;
	}

	public void calculationArea(){
			this.area = w*h;
	}
}
