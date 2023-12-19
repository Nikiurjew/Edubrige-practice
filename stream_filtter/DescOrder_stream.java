package stream_filtter;

import java.util.ArrayList;
import java.util.List;

public class DescOrder_stream {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(40);
		ob.add(55);
		ob.add(43);
		ob.add(20);
		ob.add(60);
		ob.add(11);
		System.out.println(ob);
		List<Integer> descorder=ob.stream().sorted((i1,i2)->(i1>i2)?-1:0).toList();
		
		System.out.println(descorder);
		//desc
		List<Integer> descorder1=ob.stream().sorted((i1,i2)->i2.compareTo(i1)).toList();
		System.out.println(descorder1);
		//asce
		List<Integer> asceorder2=ob.stream().sorted((i1,i2)->-i2.compareTo(i1)).toList();
		System.out.println(asceorder2);

	}

}
