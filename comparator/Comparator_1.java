package comparator;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		if(I1<I2)
			return 1;
		else if(I1>I2)
			return -1;
		else 
		return 0;
	}
	
}
public class Comparator_1 {

	public static void main(String[] args) {
		TreeSet ob = new TreeSet(new MyComparator2());
		ob.add(10);
		ob.add(6);
		ob.add(4);
		ob.add(8);
		ob.add(12);
		ob.add(22);
		ob.add(24);
		System.out.println(ob);

	}

}
