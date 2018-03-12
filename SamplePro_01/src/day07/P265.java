package day07;

public class P265 {

	public static void main(String[] args) {

		int x =999;
		DataChange.change(x);// call by value
		System.out.println(x);//999
		System.out.println("==================");
		
		Data d = new Data();//call by reference
		d.x=800;
		DataChange.change(d);
		System.out.println(d.x);//100
		System.out.println("==================");
		System.out.println();
		System.out.println('a');
		System.out.println(true);
		System.out.println(88);
		System.out.println(88.0);
		System.out.println("###");
		
	}

}
class Data{
	int x;
}
class DataChange{
	static void change(int x){//기본형 데이터
		x = 1000;
		
	}
	static void change(Data data){//오버로딩//reference형 매개변수
		data.x = 100;
		
		
	}
}
