package comparable;

import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	String name;
	int Rank;
	public Student(String name, int rank) {
		super();
		this.name = name;
		this.Rank = rank;
	}
	@Override
	public String toString() {
		
		return "Student[name="+name+",Rank="+Rank+"]";
	}
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(Rank, o.Rank);
	}
	
	
}

public class Comparaable_code {

	public static void main(String[] args) {
		PriorityQueue <Student> p= new PriorityQueue<Student>();
		p.add(new Student("bob",106));
		p.add(new Student("alice",107));
		p.add(new Student("devid",101));
		p.add(new Student("jhon",102));
		
		System.out.println(p);
		
		System.out.println();
		
		Iterator<Student>it = p.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
