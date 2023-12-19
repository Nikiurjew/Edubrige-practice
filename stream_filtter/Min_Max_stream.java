package stream_filtter;

import java.util.ArrayList;

public class Min_Max_stream {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(40);
		ob.add(55);
		ob.add(43);
		ob.add(20);
		ob.add(60);
		ob.add(11);
		System.out.println(ob);
		int minv=ob.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minv);
		int maxv=ob.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxv);
	}

}
