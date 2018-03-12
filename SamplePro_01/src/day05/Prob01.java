package day05;

import java.util.Arrays;

public class Prob01 {

	public static void main(String[] args) {

		int count = 0;
		
		if(args.length == 1){
			count = Integer.parseInt(args[0]);
		}
		int[] num = new int[count];
		
		num[0] = (int) ((Math.random()*45)+1);
		
		for(int i = 1; i < num.length; i++){
			num[i] = (int) ((Math.random()*45)+1);
			for(int j = 0; j < i; j++){
				if(num[i] == num[j]){
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i<num.length-1; i++){
			for(int j = i+1; j<num.length; j++){
				if(num[i] > num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
