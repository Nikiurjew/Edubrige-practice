package stream_filtter;

import java.util.ArrayList;

public class Count_stream {

	public static void main(String[] args) {
		ArrayList<Integer> sal = new ArrayList<Integer>();
		sal.add(4000);
		sal.add(5500);
		sal.add(1000);
		sal.add(1100);
		sal.add(1200);
		System.out.println("before incrementing the salary"+sal);
//		
		long total=sal.stream().count();
		System.out.println("total number of data inserted "+total);


	}

}
