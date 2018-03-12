package day05;

import java.util.Arrays;

public class P210 {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("실행방법");
			System.out.println("ex)이름/점수1/점수2/점수3/점수4/점수5");
			return;
		}

		String msg ="java";
		char[] c = new char[msg.length()];
		for(int i = 0 ; i<c.length; i++){
			c[i] = msg.charAt(i);
		}
		System.out.println(Arrays.toString(c));
		
		char[] cc = msg.toCharArray();
		System.out.println(Arrays.toString(cc));
		
		System.out.println("=========================");
		String data ="홍길동/90/85/44/59/70";
		String[] d = null ;
		
		if(args.length != 0){
		}
		d = data.split("/");
		System.out.println(Arrays.toString(d));
		
		double avg = 0;
		int sum = 0;
		for(int i =1 ; i< d.length; i++){
			sum += Integer.parseInt(d[i]);
		}
		
		avg = sum/5;
		System.out.println("총점 : "+sum+" 평균 :"+avg);
	}
}
