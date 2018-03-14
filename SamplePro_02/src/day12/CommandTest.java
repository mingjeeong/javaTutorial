package day12;

public class CommandTest {

	public static void main(String[] args) {

		Command c = null;
		
		switch(args[0]){
			case "delete":
				c = new DeleteCommand();
				break;
			case "insert":
				c = new InsertCommand();
				break;
			case "select":
				c = new SelectCommand();
				break;
			case "update":
				c = new UpdateCommand();
				break;
			default:
				break;
		}
		c.exec();
		c.print();
	}

}
