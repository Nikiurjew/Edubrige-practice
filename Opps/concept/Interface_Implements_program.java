package Opps.concept;

 class Creatures{
	public  void eats() {
		System.out.println("All creatures can eat");
	}
}
 interface Fly{
	 public void flies();
 }
 interface Swim{
	 public void swimes();
 }
 class Birds extends Creatures implements Fly{

	@Override
	public void flies() {
		System.out.println("Bird can Fly");
		
		
	}
	 
 }
 class Fish extends Creatures implements Swim{

	@Override
	public void swimes() {
		System.out.println("Fish can swim");
		
	}
	 
 }
 class FlyingFish extends Creatures implements Swim,Fly{

	@Override
	public void flies() {
		System.out.println("FlyingFish can fly");
		
	}

	@Override
	public void swimes() {
		System.out.println("FlyingFish can swim");
		
	}
	 0
	 
 }
 

public class Interface_Implements_program {

	public static void main(String[] args) {
		Birds ob= new Birds ();
		ob.eats();
		ob.flies();
		
		Fish ob1= new Fish ();
		ob1.eats();
		ob1.swimes();
		
		FlyingFish ob2= new FlyingFish ();
		ob2.eats();
		ob2.flies();
		ob2.swimes();
		

	}

}
