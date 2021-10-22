//import java.util.*;
import java.time.*; // Imports LocalDateTime class
import java.time.format.DateTimeFormatter; // Imports date formatter class

public class MakingMoneyATM { // Class name has to match the class file name
	public static void main(String[]args) {
		/* System.out.print("Enter your name: "); 
		Scanner input = new Scanner(System.in); // Object scanner named input
		String userName = input.next(); // 
		input.close(); */
		
		// Printing the display
		System.out.println("     ______________________________________________________________");
		System.out.println("    /                                                             /");
		System.out.println("   /                                                             / ");
		System.out.println("  /                  Making Money Bank ATM Service              /  ");
		System.out.println(" /                                                             /   ");
		System.out.println("/_____________________________________________________________/    ");
		System.out.println("\n			   Welcome! \n");
		System.out.println("/////////////////////////////////////////////////////////////////////\n");
		System.out.println("		Insert your card to proceed.");
		
		// Status and date
		LocalDateTime dateObj = LocalDateTime.now(); // Retrieve date and time
		DateTimeFormatter dateFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy"); // Converts the time format
		String dateFormatted = dateObj.format(dateFormatObj); // Formatted string
		System.out.printf("		The time is "+ dateFormatted);
		System.out.println("\n\n/////////////////////////////////////////////////////////////////////");
		
		// SO many objects 0-0
		//System.out.println("\nWelcome! " + userName);
	}
}
