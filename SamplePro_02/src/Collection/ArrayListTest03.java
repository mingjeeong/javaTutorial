package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest03 {

	public static void main(String[] args) {
		ArrayList<Student> list = dataSet();
		
		//출력
//		for(int i = 0; i < list.size(); i++){
//			Student s = (Student)list.get(i);
//			System.out.println(s);//s.toString() 자동 호출
//		}
		
//		for(Student s : list){//향상된 for문 (집합안에들어있는거:집합) 콜렉션 제네릭쓰면 사용
//			System.out.println(s);
//		}
		
		//표준출력 방식 (Collection 전체적인 표준)
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext()){
			Student s = iter.next();//제네릭쓰면 캐스팅안해도 됨
			System.out.println(s);
		}
		
		
	}
	static ArrayList<Student> dataSet() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이민정",25));
		list.add(new Student("박보검",26));
		list.add(new Student("아이유",27));
		list.add(new Student("송혜교",28));
		
		return list;
	}

}
