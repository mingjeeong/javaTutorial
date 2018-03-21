package day13;

public class DataTypeTest {

	public static void main(String[] args) {

		char ch ='A';
		if(ch == 'A'){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		char c = add(ch);
		System.out.println(c);
		
		
		
		String str = "만나서 반갑";
		if(str == "만나서반갑"){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		String s = add(str);
		System.out.println(s);
	}
	static char add(char ch){
		ch += 'B';
		return ch;
	}
	static String add(String str){
		str +="습니다";
		return str;
	}

}
