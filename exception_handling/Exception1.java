package exception_handling;

import java.util.Scanner;

class MyClass extends Exception {
    public MyClass(String message) {
        super(message);
    }
}

 class Booking {
    public int totalTickets = 100;
    

    public int getTotalTickets() {
        return totalTickets;
    }
 }


public class Exception1 {

	public static void main(String[] args) {
		Booking ob = new Booking();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of ticket u wants:");
		int numberOfTickets= sc.nextInt();
	
		
		 

        try {
        	int totalTickets=100;
			if (numberOfTickets > totalTickets) {
                throw new MyClass("Sorry, only " + totalTickets + " tickets available.");
            }else {
        
			totalTickets -= numberOfTickets;
			System.out.println(numberOfTickets + " ticket(s) booked successfully.");
    }
            System.out.println("Available tickets: " + ob.getTotalTickets());
            
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());

        }
	}

}
