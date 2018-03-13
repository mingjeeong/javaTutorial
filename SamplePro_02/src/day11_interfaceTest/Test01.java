package day11_interfaceTest;

public class Test01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Rectangle r1 = new Rectangle(4,2);
		
		Shape[] s = {c1,r1};
		Drawable[] d ={c1,r1};
		
		for(int i =0; i<s.length; i++){
			System.out.println(s[i].calculatorArea());
			
			if(s[i] instanceof Drawable)
				((Drawable)s[i]).draw();
		}
		System.out.println("================");
		ShapeDrawable[] sd ={c1,r1};
		sd[0].draw();
		System.out.println(sd[0].calculatorArea());
	}
}
