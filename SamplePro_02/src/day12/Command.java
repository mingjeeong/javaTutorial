package day12;

public interface Command {

	public abstract void exec();
	
	default void print(){
		System.out.println("Command print");
	}
}
