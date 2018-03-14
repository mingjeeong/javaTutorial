package day12;

public class CommandTest03 {

	public static void main(String[] args) {

		Command delete = () -> {
			System.out.println("delete ����");
		};
		
		Command update = () -> {
			System.out.println("update ����");
		};
		Command insert = () -> {
			System.out.println("insert ����");
		};
		Command select = () -> {
			System.out.println("select ����");
		};
		
		
		delete.exec();
		update.exec();
		insert.exec();
		select.exec();
		
	}

}
