package Opps.concept;

class Parent{
	public void parent() {
		System.out.println("parent properties");
	}
}
class Child extends Parent{
	public void child() {
		System.out.println("Child properties");
	}
}

public class Inheretance_Single_Level {

	public static void main(String[] args) {
		Child ob= new Child();
		ob.child();
		ob.parent();

	}

}
