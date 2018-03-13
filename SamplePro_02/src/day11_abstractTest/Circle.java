package day11_abstractTest;

public class Circle extends Shape{
	
	private double r ;
	
	@Override
	public double calculatorArea() {
		return Math.PI*r*r;
	}
}

abstract class Shape{
	protected double area;//����
	public abstract double calculatorArea();
	void print(){}//�Ϲݸ޼���
}
