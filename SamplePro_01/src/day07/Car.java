package day07;

public class Car {
	/**
	 * @author leeminjeong
	 */
	public String color;
	public String gearType;
	public int door;
	
	public Car(){
		System.out.println("Car() 호출");
	}
	
	public Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	/**
	 * Car 정보 출력 메소드
	 */
	public void print(){
		System.out.println(color+" "+gearType+" "+door);
	}

}
