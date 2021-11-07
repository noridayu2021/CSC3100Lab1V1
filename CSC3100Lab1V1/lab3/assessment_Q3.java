//Name:Daneshwaren Ragupathy
//Matriks No:209858
//Question 3 :Write a program that reads the subtotal and the gratuity rate and then computes the gratuity and total.

import java.util.Scanner; //import class scanner
public class assessment_Q3 {  //class 
public static void main(String[]args) {  //main method
	Scanner input=new Scanner(System.in); //A new Scanner object is placed
	
	//Read input from user
	System.out.print("Please enter a subtotal: ");
	double subtotal=input.nextDouble(); // subtotal is entered
	System.out.print("Please enter a gratuity rate:");
	double gratuityRate=input.nextDouble(); // gratuity rate is entered
	
	//Calculate the gratuity and the total
	double gratuity=subtotal*(gratuityRate/100); // The formula to calculate gratuity
	double total=subtotal + gratuity;            // The formula to calculate total
	
	//print results
	System.out.println("**************************");
	System.out.println("* The gratuity is RM " + gratuity +" *" );
	System.out.println("**************************");
	
	
	
	System.out.println("************************");
	System.out.println("* The total is RM " + total +" *");
	System.out.println("************************");
}
}
