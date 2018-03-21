package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest01 {

	public static void main(String[] args) {
//		Object[] data = dataSet();
//
		// for(int i=0; i<data.length; i++){
		// System.out.println(data[i]);
		// }
		ArrayList data = dataSet();
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).toString());
		}
	}

	static ArrayList dataSet() {
		String name = "이민정";
		int age = 25;
		double height = 170.89;

		Object[] data = new Object[3];//배열:갯수 명확히
		data[0] =name;
		data[1] = new Integer(age);
		data[2] = new Double(height);
		
//		Vector v = new Vector(2);//백터:사이즈에 국한되지 않음, 메모리 많이 잡아먹음->ArrayList로 변경
//		v.add(name);
//		v.add(new Integer(age));
//		v.add(new Double(height));
		
		ArrayList array = new ArrayList();
		array.add(name);
		array.add(new Integer(age));
		array.add(new Double(height));
		
		return array;
	}
}
