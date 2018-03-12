package day04;

public class Prob1 {

	public static void main(String[] args) {
//		Prob1. Prob1 클래스의 main() 에서
//		 주어진 문자열 배열을 생성하여 
//		 배열의 내용을 역순으로 출력하할 수 있도록 
//		 main 메서드를 작성하세요. 
//		 
//		-	문자열 배열의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 출력한다.
//		-	입력으로 주어진 문자열 배열의 예 :
//		   { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" }
//
//		처리 결과의 예 : 아래 참고.
//		gnimmargorP avaJ
//		CBDJ
//		g01elcarO
//		telvreS/PSJ
		
		String[] str ={ "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int i = 0 ; i < str.length ; i++){
			for(int j = str[i].length()-1 ; j >=0 ; j--){
				System.out.print(str[i].charAt(j));
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		// 예제 )문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
		String msg = "no";
		if(msg.equals("yes")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		System.out.println("=========================");
		
//		예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .
//
//		class Prob2 { 
//			public static void main(String[] args) { 
//				int[] arr = {10, 20, 30, 40, 50}; 
//				
//				// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
//				
//				System.out.println("sum="+sum);
//			 } 
//		}
		int[] arr = {10, 20, 30, 40, 50}; 
		int sum = 0;
		for(int i = 0 ; i< arr.length ; i++){
			 sum += arr[i];
		}
		System.out.println("sum="+sum);
		
		System.out.println("=========================");
		
//		예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
//	      몇까지 더해야 총합이  100  이상이 되는지 ?
		
		int total = 0;
		for(int i = 1 ;;i++){
			if(i%2 == 1){
				total += i;
			}else if(i%2 == 0){
				total += (-1)*i;
			}
			if(total >= 100){
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
	}

}
