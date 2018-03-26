package thread.basic.ex;
//1.Runnable 구현
public class MakeTexi implements Runnable{
	
String work;
	
	public MakeTexi() {
		super();
	}

	public MakeTexi(String work) {
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
