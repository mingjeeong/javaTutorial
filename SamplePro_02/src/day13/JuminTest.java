package day13;

import java.util.Calendar;

public class JuminTest {

	public static void main(String[] args) {

		String id="940204-2195823";
		
		char sung = id.charAt(7);
		
		if(sung == '1'|| sung =='3'){
			System.out.println("남자");
		}else if(sung == '2'|| sung == '4'){
			System.out.println("여자");
		}
		
		char a =id.charAt(8);
		
		switch (a) {
		case '0':
			System.out.println("서울");
			break;
		case '1':
			System.out.println("인천/부산");
			break;
		case '2':
			System.out.println("경기");
			break;
		case '9':
			System.out.println("제주");
			break;
		default:
			break;
		}
		
		String birthyear = id.substring(0, 2);
		String n = id.substring(0, 1);
		System.out.println(birthyear);
	
		int age =0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		switch(n){
			case "0":
				age =year -(2000+Integer.parseInt(birthyear))+1;
				break;
			case "9":
				age = year -(1900+Integer.parseInt(birthyear))+1;
				break;
			case "8":
				age = year -(1800+Integer.parseInt(birthyear))+1;
				break;
			case " 7":
				age = year -(17000+Integer.parseInt(birthyear))+1;
				break;
			default:
				System.out.println("해석불가");
		}
		System.out.println(age);
		
	
	}

}
