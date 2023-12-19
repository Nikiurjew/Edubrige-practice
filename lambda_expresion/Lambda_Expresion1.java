package lambda_expresion;
interface Myinter{
	void display();
	
}
public class Lambda_Expresion1 {

	public static void main(String[] args) {
		Myinter ob = ()-> {System.out.println("Hello World");};
		ob.display();

	}

}
