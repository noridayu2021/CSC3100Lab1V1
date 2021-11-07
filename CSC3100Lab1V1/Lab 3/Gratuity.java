//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:3
//	Question	:3
//	Description	:To compute gratuity and total

import java.util.Scanner;
public class Gratuity {
public static void main(String[]args) {

//Input Subtotal and Gratuity rate
Scanner input = new Scanner(System.in);
System.out.println("Enter the subtotal (RM) and gratuity rate (100%)");
double subtotal = input.nextDouble();
double gratuityRate = input.nextDouble();

//Calculation 
double gratuity = subtotal*(gratuityRate/100) ;
double total = gratuity+subtotal ;
System.out.println("The Gratuity is : " + "RM " + gratuity );
System.out.println("The Total is : " + "RM " + total);



}
}
