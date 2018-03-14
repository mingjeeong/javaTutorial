package day12;

public class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("SelectCommand");		
	}
	
	public void print(){
		System.out.println("SelectCommand print");
	}

}
