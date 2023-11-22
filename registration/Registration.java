package registration;

import java.util.Scanner;

public class Registration {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Username");
			String a=sc.next();
			System.out.println("Enter the Password :");
			String b=sc.next();
			//compares if the username and password is correct
			if(a.equalsIgnoreCase("Nikita") && b.equalsIgnoreCase("Nikita@12"))
			{
				System.out.println("Login successful");
			}else {
				System.out.println("Unsuccessful");
			}
			

		}

	}


