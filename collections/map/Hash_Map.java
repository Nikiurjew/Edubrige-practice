package collections.map;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"Bob");
		map.put(102,"david");
		map.put(103,"nikita");
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
