package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        //set.remove(2);
        set.add(20);
        set.add(23);
        set.add(55);
//        System.out.println("the list contains:"+set.contains(1));
//        System.out.println(set); 
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
//        set.remove(2);
        set1.add(20);
        set1.add(6);
        set1.add(5);
//        System.out.println(set1);
//        set1.addAll(set);
//        System.out.println(set1);
//        set1.retainAll(set);
//        System.out.println(set1);
        set.removeAll(set1);
        System.out.println(set);
        
	}

}
