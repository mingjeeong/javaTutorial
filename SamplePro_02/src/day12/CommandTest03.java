package day12;

public class CommandTest03 {

	public static void main(String[] args) {

		Command delete = () -> {
			System.out.println("delete 荐青");
		};
		
		Command update = () -> {
			System.out.println("update 荐青");
		};
		Command insert = () -> {
			System.out.println("insert 荐青");
		};
		Command select = () -> {
			System.out.println("select 荐青");
		};
		
		
		delete.exec();
		update.exec();
		insert.exec();
		select.exec();
		
	}

}
