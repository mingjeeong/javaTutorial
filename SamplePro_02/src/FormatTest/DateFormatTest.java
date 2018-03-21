package FormatTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today = new Date();
		System.out.println(today);
		
		//yyyy년도 mm월 dd일 요일 hh시 mm분 ss초
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(df.format(today));
		
		//2017-12-25 12:25:00 지정하고 싶다면? 생성자 setter
		Calendar c = Calendar.getInstance();
		c.set(2017, 12-1, 25, 12, 25, 00);
		
		Date day = c.getTime();
		System.out.println(df.format(day));
	}

}
