package thread.basic.ex;

public class MyThread extends Thread {

	boolean flag = false;

	public void run() {
		while (!flag) {
			System.out.println(getName() + "작업중..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ThreadDeath e) {
				System.out.println("stop()의한 예외발생");
			}
		}
	}
}
