package day12;

public class PhoneTest {

	public static void main(String[] args) {
		PhoneInfo info1 = new PhoneInfo("ȫ�浿","010-1111-4444");
		PhoneInfo info2 = new PhoneInfo("ȫ�浿","010-1111-4446");
		PhoneInfo info3 = new PhoneInfo("��浿","010-1111-4444");
		PhoneInfo info4 = new PhoneInfo("ȫ�浿","010-1111-4444");
		
		if(info1.equals(info4)){
			System.out.println(">>>");
			System.out.println(info1.toString());
		}
		
	}
}
