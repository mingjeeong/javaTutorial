package day11;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 6);
		RectTriangle rectTri = new RectTriangle(6, 2);
	
		Shape[] shape ={rect, rectTri};
		
		for(int i = 0; i<shape.length; i++){
			System.out.println("area:"+shape[i].getArea());
			if(shape[i].getNumSides() == 4){
				rect.resize(0.5);
				System.out.println("new area:"+shape[i].getArea());
			}
		}
	}
	
	
}
