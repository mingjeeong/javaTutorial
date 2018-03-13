package day11;

public class RectTriangle extends Shape{

	private double width, height;

	public RectTriangle() {
		super(3);
	}

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height*0.5;
	}
	
	
}
