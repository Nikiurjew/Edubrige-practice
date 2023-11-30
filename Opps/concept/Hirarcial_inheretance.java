package Opps.concept;

class Bhogendra{
	public void papa() {
		System.out.println("parents properties");

	}
}
class Daisy extends Bhogendra{
	public void daisy() {
		System.out.println("child properties");
	}
}
class Nikita extends Bhogendra{
	public void niki() {
		System.out.println("child properties");
	}
}

public class Hirarcial_inheretance {

	public static void main(String[] args) {
		Daisy ob =new Daisy();
		ob.daisy();
		ob.papa();
		Nikita ob1 =new Nikita();
		ob1.niki();
	}

}
