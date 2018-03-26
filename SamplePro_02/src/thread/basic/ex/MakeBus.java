package thread.basic.ex;
//1.thread 클래스 상속
public class MakeBus extends Thread{
	String work;
	
	public MakeBus() {
		super();
	}

	public MakeBus(String work) {
		super();
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	//2.run메소드 오버라이딩
	public void run(){
		for(int i=0; i< 5; i++){
			System.out.println(work+" 작업중..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
