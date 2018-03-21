package day14;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		
		String str = "독도는, 대한민국의, 아름다운,, 섬이다";

		StringTokenizer st = new StringTokenizer(str, ",");
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());
		// System.out.println(st.nextToken());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("=====================");
		
		String[] tokens = str.split(",");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
