import java.util.Scanner;
public class Cinema {
	public static void main(String[] args) {

//Declarations
		Scanner input = new Scanner(System.in);
		int age;
		int vaccine ;
//Input
		System.out.println("Welcome to Galaxy Cinemas......");
		System.out.println("Please enter your age to check your eligibility....");
		age = input.nextInt();
		System.out.println("Enter 1 if fully vaccinated ");
		System.out.println("Enter 0 if partially or not vaccinated ");
		vaccine = input.nextInt();


		if((age>17 && vaccine ==1))
			System.out.println("You’re eligible to enter Enjoy Your Movie");
		else 
			System.out.println("Sorry you're not eligible to enter the cinema");

}
}