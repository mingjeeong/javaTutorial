package day12;

public class AnnonymousClassTest {

	public static void main(String[] args) {
		Command delete = new Command(){

			@Override
			public void exec() {
				System.out.println("delete 작업수행");
				
			}
		};
		
		Command update = new Command(){

			@Override
			public void exec() {
				System.out.println("update 작업수행");
			}
		};
		
		Command select = new Command(){

			@Override
			public void exec() {
				System.out.println("select 작업수행");
			}
		};
		
		Command insert = new Command(){

			@Override
			public void exec() {
				System.out.println("insert 작업수행");
			}
		};
		
		delete.exec();
		insert.exec();
		select.exec();
		update.exec();
	}
}

class Delete implements Command{

	@Override
	public void exec() {
		
	}
	
}
