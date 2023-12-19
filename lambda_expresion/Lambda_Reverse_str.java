package lambda_expresion;
interface MyInter{
	 int display(int n);
	
}

public class Lambda_Reverse_str {

	public static void main(String[] args) {
		MyInter ob = (n) ->{
			int reversed=0;
			while(n!=0) {
				int lastdigit = n % 10;  
				reversed = reversed * 10 + lastdigit; 
				n = n/10; 
			}
			return reversed;
		};
		System.out.println("reversed number is  "+ob.display(12345));

	}
}


