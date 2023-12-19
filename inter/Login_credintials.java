package inter;

import java.util.Scanner;


public class Login_credintials {

	public static void main(String[] args) {
		
        String Username = "Nikita";
        String Password = "Nikita@12";

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredname = scanner.nextLine();
        System.out.print("Enter password: ");
        String enteredPass= scanner.nextLine();

        
        if (Username.equals(enteredname) && Password.equals(enteredPass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

	}

}
