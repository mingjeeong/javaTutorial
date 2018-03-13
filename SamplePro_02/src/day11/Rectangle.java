package day11;

public class Rectangle extends Shape implements Resizable{

	private double width, height;
	
	public Rectangle() {
		super(4);
	}

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = width*s;
		height = height*s;
		
	}

	@Override
	public double getArea() {
		return width*height;
	}
	
	

	
	
	
}
