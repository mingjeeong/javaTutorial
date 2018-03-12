package day06;

import java.util.Arrays;

import day07.Car;

public class Student {

	String name;
	private int[] sungjuk;
	//
	private Car car;
	
	public void setSungjuk(int[] sungjuk){
		this.sungjuk = sungjuk;
	}
	public int[] getSungjuk(){
		return this.sungjuk;
	}
	
	public void setCar(Car car){
		this.car = car;
	}
	public Car getCar(){
		return this.car;
	}
	
	public double calAvg(){
		if(sungjuk == null || sungjuk.length == 0){
			return 0.0;
		}
		double avg = 0;
		double sum = 0;
		for(int i =0 ; i < sungjuk.length; i++){
			sum= sum + sungjuk[i];
		}
		avg = sum / sungjuk.length;
		
		return avg;
	}
	
	public char calGrade(){
		double data = this.calAvg();
		return data >= 90 ? 'A' : data >= 80 ? 'B' : data >= 70 ? 'C' : 'F';
	}

	public void print() {
		System.out.println("학생이름 : " + this.name);
		System.out.println("성적 :"+Arrays.toString(sungjuk));
		System.out.println("평균 : "+this.calAvg());
		System.out.println("등급 : "+this.calGrade());
		System.out.println();
	}
}
