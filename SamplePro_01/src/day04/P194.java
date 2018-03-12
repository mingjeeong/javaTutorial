package day04;

public class P194 {

	public static void main(String[] args) {
		int[] num = {77,88,99,100,55};

		for(int i = 0 ; i < num.length ; i++){
			System.out.println(num[i]);
		}
		System.out.println("===============");
		
		for(int data : num){
			System.out.println(data);
		}
		System.out.println("===============");
		
		int[] temp = new int[num.length*2];
		
		System.arraycopy(num, 0, temp, 1, num.length);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		for(int data : temp){
			System.out.println(data);
		}
		System.out.println("===============");
		
		String[] name = {};
		//String[] name = {"박보검", "이민정", "이유림"};
		System.out.println(name.length);
		for(String data : name){
			System.out.println(data);
		}
		
		int[] jumsu = null; //jumsu. X
		jumsu = new int[10]; //jumsu. O
	}
}
