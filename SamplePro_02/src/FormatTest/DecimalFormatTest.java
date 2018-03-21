package FormatTest;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		double[] data ={
				123.6789,11111111111111111111111222.22,999.99999999,123.5
		};
		
		//1. 소수점 3자리까지만 출력
		//2. 정수부분 세자리마다 콤마 출력
		DecimalFormat df = new DecimalFormat("$###,###.###");
		for(int i = 0; i<data.length; i++){
			System.out.println(df.format(data[i]));
		}
	}
}
