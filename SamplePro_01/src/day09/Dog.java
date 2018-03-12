package day09;

public class Dog extends Animal{

	String kind = "Dog_kind";
	String name;
	
	public Dog() {
		//super();
		//super.kind ="강아지";
		super("강아지");
	}

	public Dog(String kind, String name) {
		//super();
		//super.kind ="강아지";
		super("강아지");
		this.kind = kind;
		this.name = name;
	}

	public void print(){
		System.out.println("Dog kind : "+super.kind+" "+this.kind+" name:"+this.name);
	}

	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기...");
	}
	

	
	
}
