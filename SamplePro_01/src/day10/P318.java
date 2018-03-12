package day10;

public class P318 {

	public static void main(String[] args) {

		Circle c = new Circle(new Point(3,5),5,"white");
		c.draw();
	}


}
class Point{
	int x;
	int y;
	
	
	public Point() {}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	
	
}
class Shape{
	String color;

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public void draw(){
		System.out.println(color+"로 그리기");
	}
	
}

class Circle extends Shape{
	Point p;
	int r;
	
	public Circle() {
		super();
	}

	public Circle(Point p, int r, String color) {
		super(color);
		this.p = p;
		this.r = r;
	}
	
	public void draw(){
		if(p != null)
			p.print();
		System.out.println("반지름:"+r);
	}
	
	
}

class Triangle extends Shape{
	Point[] point = new Point[3];
}
