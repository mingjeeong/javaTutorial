package thread.basic.ex;

public class ThreadTest {

	public static void main(String[] args) {

		MakeBus mb1 = new MakeBus("버스틀 만들기");
		//mb1.run();
		//3.start함수 호출
		mb1.start();
		
		MakeBus mb2 = new MakeBus("엔진부착");
		//mb2.run();
		mb2.start();
	}

}

