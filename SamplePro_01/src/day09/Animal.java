package day09;

public abstract class Animal {

	String kind;
	
	public Animal() {
		System.out.println("Animal() 수행..");
	}

	public Animal(String kind) {
		System.out.println("Animal("+kind+") 수행..");
		this.kind = kind;
	}

	public abstract void breath();
	
}
