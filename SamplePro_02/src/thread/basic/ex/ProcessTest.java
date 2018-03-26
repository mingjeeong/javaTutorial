package thread.basic.ex;

import java.io.IOException;

public class ProcessTest {

	public static void main(String[] args) {

		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");//프로세스 실행
			System.out.println("프로세스 실행");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("실행실패:" + e.getMessage());
		}
	}

}
