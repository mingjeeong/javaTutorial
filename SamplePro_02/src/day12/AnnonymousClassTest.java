package day12;

public class AnnonymousClassTest {

	public static void main(String[] args) {
		Command delete = new Command(){

			@Override
			public void exec() {
				System.out.println("delete �۾�����");
				
			}
		};
		
		Command update = new Command(){

			@Override
			public void exec() {
				System.out.println("update �۾�����");
			}
		};
		
		Command select = new Command(){

			@Override
			public void exec() {
				System.out.println("select �۾�����");
			}
		};
		
		Command insert = new Command(){

			@Override
			public void exec() {
				System.out.println("insert �۾�����");
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
