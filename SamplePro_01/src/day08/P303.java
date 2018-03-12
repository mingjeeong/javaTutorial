package day08;

public class P303 {

	
	public static void main(String[] args) {

		BlockTest test1 = new BlockTest();
		BlockTest test2 = new BlockTest();
		BlockTest test3 = new BlockTest();
	}
	
	

}

class BlockTest{
	BlockTest(){
		System.out.println("BlockTest() 생성자...");
	}
	static{
		System.out.println("static{..} 초기화 블럭");
	}
	
	{
		System.out.println("{...} 초기화블럭");
	}
}
