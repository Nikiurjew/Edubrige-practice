package exception_handling;

import java.util.Scanner;

class MyClass extends Exception{
	MyClass(String message){
		super(message);
	}
}
class Ticket{
	  int ticket;
	  
		if(ticket==100) {
			System.out.println("booking succesful");
		}else {
		System.out.println("No ticket available");
		}
	
}


	public class TicketBooking_Exception {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("enter the number of ticket:");
			int tickets = sc.nextInt();
			try {
				String ticket;
				System.out.println("Avaiable Ticket"+ticket);
			}catch(Exception e) {
				e.printStackTrace();
			}
	    }
			
			

	}
}

	