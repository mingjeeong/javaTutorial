package day08;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] sungjuk;
	private Boolean flag;
	
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int[] sungjuk) {
		this.name = name;
		this.sungjuk = sungjuk;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getSungjuk() {
		return sungjuk;
	}
	public void setSungjuk(int[] sungjuk) {
		this.sungjuk = sungjuk;
	}
	
	
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public void print(){
		System.out.println("Student name :"+name+"sungjuk :"+Arrays.toString(sungjuk));
		
	}

}
