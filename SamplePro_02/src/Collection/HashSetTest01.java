package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("dog");
		set.add("cat");
		set.add("lion");
		set.add("tiger");
		set.add("dog");//중복
		
		System.out.println(set);//중복된 데이터 들어가지않음,순서없음
	}
}
