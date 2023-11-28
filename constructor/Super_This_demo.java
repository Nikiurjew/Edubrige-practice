package constructor;

class Test{
	public Test(){
		
		System.out.println("no-arg constructor");
		
	}
	public Test(int a ,int b) {
		this();
		System.out.println("Parametrized constructor");
	}
}
public class Super_This_demo {

	public static void main(String[] args) {
		Test ob = new Test(10,2);

	}

}
