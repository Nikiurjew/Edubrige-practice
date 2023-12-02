package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Methods {

	public static void main(String[] args) {
		//ArrayList ob = new ArrayList();
		List l1 = new ArrayList();
		ArrayList<String> ob =new ArrayList<String>();
		ob.add ("bob");
		ob.add("Alice");
		ob.add("Nikita");
		ob.add("Muskan");
		ob.add(null);
		ob.add(null);
		ob.add(null);
//		ob.add(0.2f);
//		ob.add(20.55);
//		ob.add(1243l);
//		l1.add(40);
//		l1.add(20);
//		l1.add(10);
//		System.out.println("the unsorted list"+ob);
//		
//		Collections.sort(l1);
//		System.out.println("the sorted list"+l1);
//		
//		Collections.reverse(ob);
//		System.out.println("reverse"+ob);
//		
//		
//		ob.remove(1);
//		System.out.println("after removing "+ob);
//		
//		ob.contains(ob);
//		System.out.println("contains"+ob);
//		
//		ob.containsAll(ob);
//		System.out.println("contains all"+ob);
//		
//		ob.get(0);
//		System.out.println("for Get:"+ob);
//		
//		ob.set(2, "david");
//		System.out.println("after set"+ob);
//		
//		ob.size();
//		System.out.println("the size is"+ob);
//		
//		boolean ob1=ob.contains("bob");
//		System.out.println(ob1);
//		
//		Collections.shuffle(l1);
//		System.out.println("suffle:"+l1);
		
		for (int i=0;i<ob.size();i++) {
			System.out.println(ob.get(i));
		}
		
		for (int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		for(String s : ob) {
			System.out.println(s);
		}
		
		Iterator it = ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		String arr[]= {"dog","cat","cow","goat"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		ArrayList ob4 = new ArrayList(Arrays.asList(arr));
		System.out.println(ob4);
		
		
		

	}

}
