package collections.list;

import java.util.Stack;

public class Stack_List {
	

	public static void main(String[] args) {
		
		 Stack<Integer> ob = new Stack<Integer>();
		    ob.push(10);
			ob.push(100);
			ob.push(20);
			ob.push(30);
			System.out.println(ob);
			System.out.println("the position of number:"+ob.search(10));
		 

	}

}
