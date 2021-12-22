//Name:Daneshwaren Ragupathy
//Matriks No: 209858
//Lab 8 ASSIGNMENT QUES 1
//DATE :22/12/2021


import java.util.Scanner;  //import a scanner class 
public class question1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in); 
		
		//declarations
		char product;
		int quantity = 0;
		int count=0;
		double price=0;
		double total=0;
	

		//print out
		System.out.println("WELCOME TO THE STORE !");
		System.out.println("Product 1 : RM2.98");
		System.out.println("Product 2 : RM4.50");
		System.out.println("Product 3 : RM9.98");
		System.out.println("Product 4 : RM4.49");
		System.out.println("Product 5 : RM6.87");
		System.out.println("Enter 0 to exit! ");
		
		//loops
		do {
			System.out.print(" \nEnter Type of product : ");
			product=input.next().charAt(0);
			
			
			switch(product) {           //switch case logic structure is used
			case '1' : price=2.98;
				break;
			case '2' : price=4.50;
				break;
			case '3': price=9.98;
				break;
			case '4': price=4.49;
				break;
			case '5': price=6.87;
				break;
			default :
						System.out.println( "\nYour Total Bill : RM " + total +" !!!!!" );
						System.out.println( "\nThank You ! Have a nice Day!" );
						System.exit(0);
			
			}
			
			
			System.out.print("\nEnter the Quantity of product: ");  //quantity of the product from user
			quantity=input.nextInt();
			
			if (quantity==0) {   //system exits if 0 is input
				System.out.println( "\nYour Total Bill : RM " + total +" !!!!!" );
				System.exit(0);
			}
			else
			total=price*quantity + total;
			System.out.println("\nThe Current Total is : RM " + total);
			input.nextLine();
			
		}
			while(product!=0);{
			}
			
			
			
		}
		
	
	}
	







