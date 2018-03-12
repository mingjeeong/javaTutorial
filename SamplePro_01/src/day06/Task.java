package day06;

public class Task {
	String s = "";

	public static String leftPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		//System.out.println(s); //error
		int count =size - str.length();
		for (int i = 0; i <count ; i++) {
			str = padChar+str;
		}
		return str;
	}

	public static void main(String[] args) {
		//Task prob1 = new Task();
		System.out.println(Task.leftPad("SDS", 6, '#'));
		System.out.println(Task.leftPad("SDS", 5, '$'));
		System.out.println(Task.leftPad("SDS", 2, '&'));
	}

}
