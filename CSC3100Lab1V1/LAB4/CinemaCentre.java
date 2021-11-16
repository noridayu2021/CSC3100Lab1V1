//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 4
//QUESTION	: Cinema centre
import java.util.Scanner;
public class CinemaCentre {
	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("WELCOME TO SIUU CINEMAS");
		System.out.println("Please enter your age");
		int age=input.nextInt();
		System.out.println("Please enter true if you are fully vaccinated");
		System.out.println("Please enter false if your not fully vaccinated");
		boolean vaccinationstatus=input.nextBoolean();
		
		if(age>17 && vaccinationstatus == true) 
			System.out.println("ENJOY YOUR MOVIE!!!");
		else
			System.out.println("YOU ARE NOT ALLOWED IN...BYE BYE");
		
		
		
			
			
			
		
			
		
		
	}

}
