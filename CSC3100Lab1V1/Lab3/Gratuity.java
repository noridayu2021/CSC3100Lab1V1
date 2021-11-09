//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 3
//QUESTION	: Computer gratuity and the total


import java.util.Scanner;
public class Gratuity {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in) ; //creating new scanner object
		final double GRATUITYRATE = 12;	
		
		//Enter the subtotal and gratuity rate
		System.out.print("Enter the subtotal and gratuity rate:");
		double subtotal = scanner.nextDouble();
		double gratuityrate = scanner.nextDouble();
		
		//Calculate the gratuity
		double gratuity = subtotal * (gratuityrate /100);
		
		//Calculate the total
		double total = subtotal + gratuity;
		
		//Print the gratuity and results
		System.out.println("The gratuity is $"+ gratuity + "and total is $" + total);
		
		
	
		
		
	
		
	}

}
