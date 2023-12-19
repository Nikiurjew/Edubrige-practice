package inter;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Lamda_exp_login {

	public static void main(String[] args) {
		String username="Nikita";
		String userPass="Nikita123";
		
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter username: ");
	        String uname = sc.nextLine();

	        System.out.print("Enter password: ");
	        String pass = sc.nextLine();

	        // Use a lambda expression with BiPredicate to check if the entered credentials are valid
	        BiPredicate<String, String> isLoginValid = (Username, password) -> 
	            username.equals(username) && password.equals(password);

	        if (isLoginValid.test(uname, pass)) {
	            System.out.println("Login successful. Welcome, " + uname + "!");
	        } else {
	            System.out.println("Login failed. Invalid username or password.");
	        }

	        sc.close();

		

	}

}
