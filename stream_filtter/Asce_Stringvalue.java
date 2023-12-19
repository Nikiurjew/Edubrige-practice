package stream_filtter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Asce_Stringvalue {

	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Nikita");
		ob.add("Muskan");
		ob.add("Neha");
		ob.add("padmavati");
		ob.add("Nia");
		ob.add("muakan");
		System.out.println(ob);
		Comparator<String> str=( s1, s2)->{
			int l1=s1.length();
			int l2=s2.length();
			
		if(l1<l2) 
			return 1;
			else if(l1>l2)
				return -1;
			else
				return s1.compareTo(s2);
			
		};
		//List<String> asceorder2=ob.stream().sorted((i1,i2)->-i2.compareTo(i1)).toList();
//		List<String> asce=ob.stream().sorted((i1,i2)->-i2.compareTo(i1)).toList();
//		System.out.println(asce);
//		List<String> descorder=ob.stream().sorted((i1,i2)->(i1>i2)?-1:0)).toList();
//		
//		System.out.println(descorder);
		//desc
		List<String> sortedList=ob.stream().sorted(str).toList();
		System.out.println("after sorting"+sortedList);
		
		}
	


	}


