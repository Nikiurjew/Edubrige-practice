package lambda_expresion;

interface Myinter3{
	int display(int n,int m);
}



public class Lambda_exp2 {

	public static void main(String[] args) {
		Myinter3 ob = (n,m)-> {return n+m;};
		System.out.println(ob.display(3,4));

	}


	}


