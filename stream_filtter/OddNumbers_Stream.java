package stream_filtter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers_Stream {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(40);
		ob.add(55);
		ob.add(10);
		ob.add(11);
		ob.add(12);
		System.out.println("before Filttering"+ob);
		//List<Integer>evenNumbers = ob.stream().filter((i)->i%2==0).collect(Collectors.toList()); //second way to get the list 
		List<Integer>oddNumbers = ob.stream().filter((i)->i%2!=0).toList();
		System.out.println("After Filtering"+oddNumbers);
		

		

	}

}
