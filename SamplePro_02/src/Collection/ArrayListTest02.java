package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(2);
		list.add("rabbit");
		list.add("tiger");
		list.add("lion");
		list.add("dog");
		list.add("cat");
		
		list.add(3, "fox");
		//list.set(3, "fox");
		
		//4번째 element 제거
		list.remove(3);
		
		Collections.sort(list);
		System.out.println(list);//list.toString() 자동으로 호출
	}

}
