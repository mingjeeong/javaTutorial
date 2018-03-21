package Collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>();
		tree.add("lee");
		tree.add("kim");
		tree.add("choi");
		tree.add("park");
		tree.add("choi");
		tree.add("aba");
	
	
		System.out.println(tree);
		System.out.println(tree.subSet("a", "l"));
		System.out.println(tree.headSet("lee"));
		System.out.println(tree.tailSet("choi"));
	}

}
