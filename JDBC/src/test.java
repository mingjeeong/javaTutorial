
public class test {

	public static void main(String[] args) {
//		String a[][] = new String[3][4];
//		System.out.println(a.length + a[1].length + a[1].length);
		
		test t = new test();
		t.printValue();
		
	}
	
	public void printValue(){
		int num =100;
		change(num);
		System.out.println(num);
	}
	
	public void change(int num){
		num += num;
	}
}
