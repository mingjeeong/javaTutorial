package day12;

public class PersonInfo<T> {

	private String name;
	private T year;//?
	
	public PersonInfo() {
		super();
	}

	public PersonInfo(String name, T year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getYear() {
		return year;
	}

	public void setYear(T year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", year=" + year + "]";
	}
	
	
}
