package day14;

public class MainTest {

	public static void main(String[] args) {

		try {
			int result = 2/0;
			//예외가 발생한 구문
			for(int i = 0; i < 4; i++){
				System.out.println(args[i]);
			}
			System.out.println("배열정상처리");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			//예외가 발생한 후에 처리
			System.out.println("예외 발생:"+e.getMessage());
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("그외의 예외:"+e.getMessage());
			e.printStackTrace();
			
		}finally{
			//예외의 관계없이 무조건 수행
			System.out.println("예외의 관계없이 무조건 수행");
		}
		System.out.println("프로그램 정상 종료");
	}

}
