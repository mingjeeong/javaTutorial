
public class test {

	public static void main(String[] args) {
//		String a[][] = new String[3][4];
//		System.out.println(a.length + a[1].length + a[1].length);//3+4+4
		
		test t = new test();
		t.printValue();
		
	}
	
	public void printValue(){
		int num =100;
		change(num);
		System.out.println(num);//100
	}
	
	public void change(int num){
		num += num;
	}
}
