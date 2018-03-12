package day03;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		for(int i = 0 ; i< sourceString.length() ; i++){
			char c = (char) (sourceString.charAt(i));
			if(c != ' '){
				c += 3;
			}
			if(c > 122){
				c = (char) (c-26);
			}
			encodedString += c;
		}

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		//System.out.println("hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh");
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
		int sum = 0;
		for(int count = 1 ; count < 11 ; count ++){
			for(int num = 1 ; num <= count ; num++){
				//System.out.print(num);
				sum += num;
			}
			//System.out.println();
		}
		System.out.println(sum);
		
		//구구단
		for(int dan =2 ; dan <10 ; dan++){
			System.out.println(dan+"단");
			for(int num =1 ; num < 10 ; num++){
				System.out.println(dan+"x"+num+"="+dan*num);
			}
		}
	}
}
