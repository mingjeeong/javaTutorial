package day13;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		//오늘 날짜출력 년 월 일 요일
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		
		Date d = new Date();
		int dd = d.getDay();
		String day="";
		
		switch(dd){
			case 1:
				day="월";
				break;
			case 2: 
				day="화";
				break;
			case 3:
				day ="수";
				break;
			case 4:
				day="목";
				break;
			case 5:
				day="금";
				break;
			case 6:
				day="토";
				break;
			case 7:
				day="일";
				break;
		}
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 "+day+"요일 입니다");
	}

}
