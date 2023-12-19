package comparator;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator3 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

	
	
}

public class Comparator_String {

	public static void main(String[] args) {
		TreeSet <String> t = new TreeSet<>(new MyComparator3());
		t.add("Apple");
		t.add("banana");
		t.add("orange");
		t.add("grape");
		t.add("kiwi");
		t.add("kiwi");
		System.out.println(t);

	}

}
