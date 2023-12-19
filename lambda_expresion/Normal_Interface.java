package lambda_expresion;
interface Myinterface{
	void display();
}
class Child3 implements Myinterface{

	@Override
	public void display() {
		System.out.println("hello world");
		
	}
	
}

public class Normal_Interface {

	public static void main(String[] args) {
		Child3 ob = new Child3();
		ob.display();
	}

}
