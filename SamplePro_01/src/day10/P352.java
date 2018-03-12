package day10;

public class P352 {
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		Singleton s3 = Singleton.getSingleton();
	}

	
}

final class Singleton{
	 
	private static Singleton s = new Singleton();
	
	private Singleton(){
		System.out.println("Singleton() 객체 생성..");
		
	}
	
	public static Singleton getSingleton(){
		//return new Singleton();
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}


