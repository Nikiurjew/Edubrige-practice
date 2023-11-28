package Methods;

class Test{
	public void display() {
		System.out.println("first methods");
	}
	public void display1() {
		this.display();
		System.out.println("Second methods");
	}
}
public class This_Methods {

	public static void main(String[] args) {
		Test ob1=new Test();
		ob1.display1();
	}

}
