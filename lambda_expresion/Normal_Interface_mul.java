package lambda_expresion;
interface Myinter12{
	int display(int n);
}
class Child7 implements Myinter12{

	@Override
	public int display(int n) {
		
		return n*n;
	}
	
}





public class Normal_Interface_mul {

	public static void main(String[] args) {
		Child7 ob = new Child7();
		
		System.out.println(ob.display(3));
	}

}
