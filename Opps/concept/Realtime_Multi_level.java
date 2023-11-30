package Opps.concept;

class Car{
	public void car() {
		System.out.println("Car");

	} 
	public void type() {
		System.out.println("Type:car");
	}
}
class Maruti extends Car{
	public void brands() {
		System.out.println("Maruti");
	}
	public void speed() {
		System.out.println("Max: 90kmph");
	}
}
class Maruti1800 extends Maruti{
	public void brand() {
		System.out.println("Maruti800");
	}
	public void Speed() {
		System.out.println("Max:80kmph");
	}
	
}


public class Realtime_Multi_level {

	public static void main(String[] args) {
	Maruti1800 ob = new Maruti1800();
	ob.type();
	ob.brand();
	ob.brands();
	ob.car();
	ob.Speed();
	ob.speed();
	

	}

}
