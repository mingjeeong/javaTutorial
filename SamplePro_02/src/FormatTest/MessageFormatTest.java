package FormatTest;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {

		String message ="친애하는{0} {1}님  ... "+"감사드립니다.";
		String [][] data ={
				{"홍길동","사원"},
				{"김길동","대리"},
				{"고길동","사장"}
		};
		
		for(int i = 0 ; i<data.length; i++){
			System.out.println(MessageFormat.format(message, data[i]));
		}
				
	}

}
