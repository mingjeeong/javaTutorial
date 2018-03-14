package day12;

public class CommandTest03 {

	public static void main(String[] args) {

		Command delete = () -> {
			System.out.println("delete 수행");
		};
		
		Command update = () -> {
			System.out.println("update 수행");
		};
		Command insert = () -> {
			System.out.println("insert 수행");
		};
		Command select = () -> {
			System.out.println("select 수행");
		};
		
		
		delete.exec();
		update.exec();
		insert.exec();
		select.exec();
		
	}

}
