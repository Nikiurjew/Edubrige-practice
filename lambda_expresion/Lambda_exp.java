package lambda_expresion;
interface Myinter2{
	int display(int n);
}

public class Lambda_exp {

	public static void main(String[] args) {
		Myinter2 ob = (n)-> {return n*n;};
		System.out.println(ob.display(3));

	}

}
