 package Opps.concept;
  abstract class Fruit{
	   abstract void taste();
 }
 class Mango extends Fruit{
	 public void taste() {
		 System.out.println("sweet");
	 }
 }

public class Abstraction_Method {

	public static void main(String[] args) {
		Mango ob = new Mango();
		ob.taste();
		

	}

}
