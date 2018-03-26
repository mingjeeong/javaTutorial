package basic;

public class Array2Test {

	public static void main(String[] args) {

		char[][] s = new char[26][];
		
		for(int i=0; i<s.length;i++){
			s[i] = new char[i+1];
			
		}
		//값을 지정하는 부분
		for(int i=0;i<s.length;i++){
			for(int j =0; j<s[i].length;j++){
				s[i][j] = (char) (j+65);//알파벳으로 나오게 수정
			}
		}
//		s[1][0]='A';
//		s[3][2]='B';
		
		//출력하는 부분
		for(int i=0;i<s.length;i++){
			for(int j =0; j<s[i].length;j++){
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
