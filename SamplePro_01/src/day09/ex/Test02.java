package day09.ex;

public class Test02 {

	public static void main(String[] args) {

		Person s = new Student("홍길동",20,20180312);
//		if(s instanceof Student)
//			((Student) s).print();
		Person t = new Teacher("이민정",30,"수학");
		Person e = new Employee("고길동",30,"행정학과");
		
		Person[] persons = {
				new Student("홍길동",20,20180312),
				new Teacher("이민정",30,"수학"),
				new Employee("고길동",30,"행정학과")
		};
		
//		for(int i = 0; i<persons.length; i++){
//			if(persons[i] instanceof Student){
//				((Student) persons[i]).print();
//			}else if(persons[i] instanceof Teacher){
//				((Teacher) persons[i]).print();
//			}else if(persons[i] instanceof Employee){
//				((Employee) persons[i]).print();
//			}
//		}
		for(int i = 0; i<persons.length; i++){
			persons[i].print();
		}
	}

}
