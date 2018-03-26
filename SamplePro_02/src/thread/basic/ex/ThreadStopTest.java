package thread.basic.ex;

public class ThreadStopTest {

	public static void main(String[] args) {

		System.out.println("메인쓰레드: "+Thread.currentThread().getName());
		
		MyThread mt = new MyThread();
		mt.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("쓰레드 종료");
		
		//mt.stop();
		
		mt.flag = true;
	}

}
