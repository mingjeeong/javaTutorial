package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6){
			set.add((int) (Math.random() * 45 + 1));
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
