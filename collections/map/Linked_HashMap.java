package collections.map;

import java.util.LinkedHashMap;

public class Linked_HashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map= new LinkedHashMap<Integer,String>();
		map.put(101,"Bob");
		map.put(102,"david");
		map.put(103,"nikita");
		map.put(108, null);
		System.out.println(map.containsKey(101));
		System.out.println(map.containsKey(107));
		System.out.println(map.get(103));
		System.out.println(map.isEmpty());
		System.out.println("before replacement "+map);
		map.put(101,"Muskan");
		System.out.println("after replacement "+map);
		System.out.println("keys "+map.keySet());
		System.out.println("values "+map.values());
		System.out.println(map.replace(103,"nikita","niki"));
		System.out.println(map);

	}

}
