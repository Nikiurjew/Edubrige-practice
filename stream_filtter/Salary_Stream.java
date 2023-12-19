package stream_filtter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Salary_Stream {

	public static void main(String[] args) {
		ArrayList<Integer> sal = new ArrayList<Integer>();
		sal.add(4000);
		sal.add(5500);
		sal.add(1000);
		sal.add(1100);
		sal.add(1200);
		System.out.println("before incrementing the salary"+sal);
		List<Integer>updatesal=sal.stream().map((s)->s+2000).collect(Collectors.toList());
		System.out.println("salary after incrementing"+updatesal);
		long totalnumber=sal.stream().count();
		System.out.println("total number of salary "+totalnumber);

	}

}
