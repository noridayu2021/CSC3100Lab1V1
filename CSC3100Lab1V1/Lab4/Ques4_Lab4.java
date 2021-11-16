import java.util.Scanner;
public class Ques4_Lab4 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter Your Age :");
		int age=input.nextInt();
		System.out.println("Please Enter True If FULLY VACCINATED");
		System.out.println("Please Enter False If NOT FULLY VACCINATED : ");
		boolean vaccinatedstatus=input.nextBoolean();
		
		if(age>17 && vaccinatedstatus==true)
			System.out.println("Please Enjoy Your Movie & Enjoy");
		else
			System.out.println("You are not allowed to enter the theatre");
		
	}
}
