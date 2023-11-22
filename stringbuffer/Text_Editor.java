package stringbuffer;

import java.util.Scanner;

public class Text_Editor {

	public static void main(String[] args) {
		StringBuffer textBuffer = new StringBuffer();
		
		System.out.println("welcome to the Text Editor");
		System.out.println("Type your text, enter 'Exit ' to finish.");
		

		Scanner scanner = new Scanner(System.in);
		String userInput;

		do {
		            
		      System.out.print("Enter text: ");
		            userInput = scanner.nextLine();

		            
		            textBuffer.append(userInput).append("\n");

		        } while (!userInput.equalsIgnoreCase("exit"));

		        // Display the final edited text
		        System.out.println("\nFinal Edited Text:");
		        System.out.println(textBuffer.toString());
		
		
		
	}

}
