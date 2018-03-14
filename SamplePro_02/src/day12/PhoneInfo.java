package day12;

public class PhoneInfo {

	private String name;
	private String phoneNumber;
	
	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean equals(Object obj) {

		if(!(obj instanceof PhoneInfo)){
			return false;
		}
		PhoneInfo info = (PhoneInfo)obj;
		if(name.equals(info.name) && phoneNumber.equals(info.phoneNumber)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 핸드폰번호=" + phoneNumber;
	}
	
}
