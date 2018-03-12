package day10.task;

public class Rectangular extends Shape1{

	private double width;
	private double hight;
	
	
	
	public Rectangular() {
		super();
	}


	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHight() {
		return hight;
	}


	public void setHight(double hight) {
		this.hight = hight;
	}


	@Override
	public void calculationArea() {
		setArea(this.hight*this.width);
	}


	@Override
	public void print() {
		System.out.println("직사각형의 면적은 "+getArea());
		
	}
	
	
}
