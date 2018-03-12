package day07;

public class FactorialTest2 {
	
	public static long factorial(int n){
		if(n<=0 || n>20)
			return -1;
		
		if(n<=1)
			return 1;
		
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i=1; i<=n ; i++){
			result =factorial(i);
			
			if(result ==-1){
				System.out.println("유효하지 않음 값입니다. (0<n<=20) :"+n);
				break;
			}
			System.out.println(i+"!="+result);
		}
	}

}
