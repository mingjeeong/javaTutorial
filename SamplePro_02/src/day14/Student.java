package day14;

public class Student {

	private String id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	public Student() {
		super();
	}

	public Student(String id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	//총점
	public int calcsum(){
		sum = kor + eng + math;
		return sum;
	}
	//평균
	public int calcAvg(){
		avg = sum / 3;
		return avg;
	}
	
	
}
