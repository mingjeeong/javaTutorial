package day09;

public class Fish extends Animal{

	String kind;
	
	public Fish() {
		super();
	}


	public Fish(String kind) {
		super();
		this.kind = kind;
	}


	public Fish(String superkind, String kind) {
		super(superkind);
		this.kind = kind;
	}
	
	public void breath(){
		System.out.println("아가미로 숨쉬기...");
	}
	
	
}
