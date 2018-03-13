package day11_interfaceTest;

public interface Shape {

	public abstract double calculatorArea();
	//void print();//일반메서드
	
}

class Circle extends Object implements ShapeDrawable{

	int r;
	
	public Circle() {
		super();
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	@Override
	public double calculatorArea() {
		return Math.PI*r*r;
	}

	@Override
	public void draw() {
		System.out.println(toString()+"그리기");
	}
}

class Rectangle extends Object implements ShapeDrawable {

	int w,h;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}

	@Override
	public double calculatorArea() {
		return w*h;
	}

	@Override
	public void draw() {
		System.out.println(toString()+"그리기");
	}
}