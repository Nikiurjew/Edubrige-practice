package collections_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		 Queue<Integer> ob = new PriorityQueue<Integer>();

     // Adding items to the pQueue
     // using add()
     ob.add(10);
     ob.add(20);
     ob.add(15);
     System.out.println(ob);
     
     // Printing the top element of
     // the PriorityQueue
     System.out.println(ob.peek());
     System.out.println(ob);
     
     
     System.out.println(ob.poll()); //remove the top element.
     System.out.println(ob);
     ob.remove();
     System.out.println(ob);
     ob.clear();
     System.out.println(ob);
//     ob.remove();      // nosuchelementException
//     System.out.println(ob);
     
     System.out.println(ob.poll()); //it will print null
     
     System.out.println(ob.peek()); 
     
     
     

	}

}
