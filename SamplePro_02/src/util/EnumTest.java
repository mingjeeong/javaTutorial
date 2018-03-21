package util;

//enum Size{
//	SMALL,
//	MEDIUM,
//	LARGE,
//	EXTRA_LARGE
//}

class Size{
	public static final int SMALL = 0;
	public static final int LARGE = 100;
}

public class EnumTest {

	public static void main(String[] args) {

		//Size size = Size.LARGE;
		
		int size = Size.LARGE;
		switch (size) {
		case Size.SMALL:
			System.out.println("작은거");
			break;
			
		case Size.LARGE:
			System.out.println("큰거");
			break;

		default:
			break;
		}
		
		
		
	}

}
