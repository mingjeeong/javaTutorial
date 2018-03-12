package day05;

import java.util.Arrays;

public class P202 {

	public static void main(String[] args) {

		String[] names ={"홍길동", "고길동", "김길동", "박길동", "최길동"};
		System.out.println(names); //주소값출력
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		
		for(String data : names){
			System.out.print(data+" ");
		}
		System.out.println();
		
		//정렬
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		System.out.println("========================");
		
		int[] num={11,99,15,57,78,64};
		
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
