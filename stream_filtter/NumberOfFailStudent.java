package stream_filtter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfFailStudent {

	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(40);
		ob.add(55);
		ob.add(43);
		ob.add(20);
		ob.add(60);
		ob.add(11);
		System.out.println("before Filttering"+ob);
		List<Integer>failStudent = ob.stream().filter((i)->i<35).collect(Collectors.toList());
		System.out.println("failed "+failStudent);
		List<Integer>asce=ob.stream().sorted().toList();
		System.out.println("ascending order"+asce);//natural defualt sorting(ascending order)
		//COmparable[I]->method is compareTo()
		// Customized sorting= Comparator[I]->methods are 
		//1.compare()
		//2.equals()
		//(expression)? value1:value2;
	}

}
