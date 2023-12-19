package stream_filtter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Grace_Marks {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(40);
		marks.add(55);
		marks.add(10);
		marks.add(11);
		marks.add(12);
		System.out.println("before adding marks"+marks);
		List<Integer> updateMarks =marks.stream().map((m)->m+20).collect(Collectors.toList());
		System.out.println("after filtering"+updateMarks);

	}

}
