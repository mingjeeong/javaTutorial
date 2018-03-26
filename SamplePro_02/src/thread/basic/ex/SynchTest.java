package thread.basic.ex;

class Count {
	int i;

	synchronized void increment() {
		i++;
	}
}

class ThreadCount extends Thread {
	Count cnt;

	public ThreadCount(Count cnt) {
		super();
		this.cnt = cnt;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			cnt.increment();
		}
	}

}

public class SynchTest {

	public static void main(String[] args) {

		Count c = new Count();
		ThreadCount tc1 = new ThreadCount(c);
		ThreadCount tc2 = new ThreadCount(c);

		tc1.start();
		tc2.start();
		
		try {
			tc1.join();
			tc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("총 수:" + c.i);//왜 20000 안나오나
	}

}
