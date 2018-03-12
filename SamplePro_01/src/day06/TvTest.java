package day06;

import day05.Student;

public class TvTest {

	public static void main(String[] args) {

		TV tv = new TV();
		tv.channel =45;
		tv.power = true;
		tv.color = "black";
		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.power();
		if(tv.isPower() == false){
			tv.power();
		}
		//tv.print();
		
		TV tv2 = new TV();
		tv2.channel =11;
		tv2.power = false;
		tv2.color = "white";
		
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.power();
		//tv2.print();
		
//		int[] num = new int[3];
//		String[] names = new String[3];
//		Student[] students = new Student[3];
//		TV[] t = new TV[3];
		int[] num = {5, 10, 44};
		String[] names = {"홍", "길", "동"};
		Student[] students = {new Student(), new Student(),new Student()};
		TV[] t = {new TV(), new TV(), new TV()};
		
		for(TV data : t){
			data.print();
		}
		
		for(int i =0; i<students.length; i++){
			students[i].display();
		}
	}

}
