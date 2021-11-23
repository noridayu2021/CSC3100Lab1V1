//	Name		:BAVAMITHIRAN JEYAPRAGAS
//	MatricNo	:210468
//	Lab			:5
//	Question	:1


import java.util.Scanner;
public class ThemePark {
	public static void main(String[] args) {
		
		//Declare Variables
	    Scanner input = new Scanner(System.in);
		int age;
		int park;
		final int themePark = 1;
		final int waterPark = 2;
		final int bothPark = 3;
		
		//Input 
		System.out.println("Please enter your age");
		age = input.nextInt();
		System.out.println("WELCOME TO MAKHOTA THEME PARK");
		System.out.println("Please enter 1 for THEME PARK");
		System.out.println("Please enter 2 for WATER PARK");
		System.out.println("Please enter 3 for BOTH PARK");
		park = input.nextInt();
		
		//Verify Park and Age
		if (age>=55) {
		   if (park==themePark)
		      System.out.println("Ticket Price : RM10");
		   else if (park==waterPark)
		           System.out.println("Ticket Price : RM15");
		   else if (park==bothPark)
		           System.out.println("Ticket Price : RM20");
		}
		
		else if (age>=21 && age<=54) {
			   if (park==themePark)
			      System.out.println("Ticket Price : RM25");
			   else if (park==waterPark)
			           System.out.println("Ticket Price : RM30");
			   else if (park==bothPark)
			           System.out.println("Ticket Price : RM45");
		}
		
		else if (age>=13 && age<=20) {
			   if (park==themePark)
			      System.out.println("Ticket Price : RM20");
			   else if (park==waterPark)
			           System.out.println("Ticket Price : RM25");
			   else if (park==bothPark)
			           System.out.println("Ticket Price : RM40");
		}
		
		else if (age>=3 && age<=12) {
		   if (park==themePark)
		      System.out.println("Ticket Price : RM10");
		   else if (park==waterPark)
		           System.out.println("Ticket Price : RM15");
		   else if (park==bothPark)
		           System.out.println("Ticket Price : RM20");
		}
		
		else if (age<3) {
			   if (park==themePark)
			      System.out.println("Ticket Price : Free Entry");
			   else if (park==waterPark)
			           System.out.println("Ticket Price : RM7");
			   else if (park==bothPark)
			           System.out.println("Ticket Price : RM5");
		}
		
		
}

}
