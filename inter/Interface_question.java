package inter;
interface Left{
	default void M1() {
		System.out.println("Left interface implemantation");
	}
	
}
interface Right{
	void M1();
}
class Child implements Left,Right{

	@Override
	public void M1() {
		System.out.println("My own implementation");
		Left.super.M1();
		
	}
	
}

public class Interface_question {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.M1();

	}

}
