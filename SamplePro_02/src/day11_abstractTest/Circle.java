package day11_abstractTest;

public class Circle extends Shape{
	
	private double r ;
	
	@Override
	public double calculatorArea() {
		return Math.PI*r*r;
	}
}

abstract class Shape{
	protected double area;//변수
	public abstract double calculatorArea();
	void print(){}//일반메서드
}
