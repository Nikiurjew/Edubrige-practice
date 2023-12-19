package lambda_expresion;
interface InterRev{
	default display(String str) { 
		String newstr="";
	for(int i = str.length()-1;i>=0;i--) {
		newstr=newstr+str.charAt(i);
	}
}
	class Child8 implements InterRev{
		
	}

public class Interface_Reverse {

	public static void main(String[] args) {
		

	}

}

