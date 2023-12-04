package collection.set;

import java.util.*;

public class LinkedHash_Set {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ob = new LinkedHashSet<Integer>();
		ob.add(10);
		ob.add(15);
		ob.add(20);
		ob.add(5);
//		System.out.println(ob);
		LinkedHashSet<Integer> ob1 = new LinkedHashSet<Integer>();
		ob1.add(1);
		ob1.add(2);
		ob1.add(3);
		ob1.add(4);
		ob1.add(6);
		ob1.add(10);
		ob1.add(15);
		ob1.add(20);
//		System.out.println(ob1);
		
//		ob.addAll(ob1);   //union
//		System.out.println(ob);
//		ob1.retainAll(ob);   //intersection
//		System.out.println(ob1);
		ob.removeAll(ob1);
		System.out.println(ob);  //Difference 

	}

}
