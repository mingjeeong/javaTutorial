package day10.task;

public class TestShape {

	public static void main(String[] args) {

		Shape1 [] shape = new Shape1[2];
		
		shape[ 0 ]  = new Circle1("원",10);
		shape[ 1 ] = new Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}

		
	}

}
