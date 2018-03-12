package day10.task;

public class Circle1 extends Shape1{

	private double radius;

	public Circle1(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		setArea(this.radius*this.radius*Math.PI);
	}

	@Override
	public void print() {
		System.out.println("원의 면적은 "+getArea());
		
	}
	
	
	
	
}
