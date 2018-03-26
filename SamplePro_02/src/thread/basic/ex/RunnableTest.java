package thread.basic.ex;

public class RunnableTest {
	public static void main(String[] args) {
		
		MakeTexi mx1 = new MakeTexi("택시틀만들기");
		Thread t1 = new Thread(mx1);
		t1.start();
		
		MakeTexi mx2 = new MakeTexi("엔진부착");
		Thread t2 = new Thread(mx2);
		t2.start();
		
		try {
			t1.join();//끝날때까지 기다려라
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램종료");
		
	}
}

