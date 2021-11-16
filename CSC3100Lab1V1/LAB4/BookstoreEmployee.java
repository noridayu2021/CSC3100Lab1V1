//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 4
//QUESTION	: Employees for Bookstore

import java.util.Scanner;
public class BookstoreEmployee {
	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		int gender;
		int age;
		
System.out.println("WELCOME TO SIUUU BOOKSTORE");
System.out.println("We are looking for employees");
System.out.println("Please enter your gender and age to check your eligibility");

;
System.out.println("Enter 1 if you are a male");
System.out.println("Enter 0 if you are a female");
gender = input.nextInt();

System.out.println("Enter your age");
age = input.nextInt();

if (gender==1 && age>=18 && age<=30)
	System.out.println("Your application is accepted. GOOD LUCK MATE!!!");

else
	System.out.println("Your application is rejected.");

	}

}
