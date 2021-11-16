import java.util.Scanner;
public class Employee {
	public static void main(String[]args) {

	//Declarations
		Scanner input = new Scanner(System.in);
		int age;
		int gender;
		
	//Input
		System.out.println("Welcome To Galaxy Bookstore");
		System.out.println("We are hiring few employees please enter your age and gender to check your eligibility");
		System.out.print("Age:");
		age = input.nextInt();
		System.out.println("Enter 1 if you're a Male");
		System.out.println("Enter 0 if you're a Female");
		gender = input.nextInt();
		
		if(age<=30 && age >=18 && gender==1)
			System.out.println("Your application is accepted");
		else
			System.out.println("Your application is rejected");
	
}
}