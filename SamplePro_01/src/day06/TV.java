package day06;

public class TV {
	
	int channel;
	String color;
	boolean power;
	
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setPower(Boolean power){
		this.power = power;
	}
	
	public Boolean isPower(){
		return this.power;
	}
	
	public void channelUp(){
		channel++;
		return;
	}
	
	public void channelDown(){
		channel--;
		return;
	}
	
	public void power(){
		power = !power;
		return;
	}
	
	public void print(){
		System.out.println("tv색상 : "+color+" 채널번호 :"+channel+" 파워여부 :"+power);
	}

}
