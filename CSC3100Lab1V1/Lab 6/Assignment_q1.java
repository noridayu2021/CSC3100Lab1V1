//Name:Daneshwaren Ragupathy
//MATRIKS NO : 209858
//LAB 6


import java.util.Scanner; //import a scanner
public class Assignment_q1 { //created a class
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter First String :"); //request input from user
		String firstmessage=input.nextLine();
		
		int length=firstmessage.length(); //calculate length of first string
		//comditions 
		if (length>=10)
			System.out.print("Substring from 5 to 10 "+ firstmessage.substring(4,10)+", and the length is "+length);
		else
			System.out.print("The String Length is less than 10");
		
		System.out.print("\nEnter Second String :");//request second input from user 
		String secondmessage=input.nextLine();
		
		//conditions
		if (firstmessage.contains(secondmessage)) {
			System.out.print("Second string exists in first string");
			String replace=firstmessage.replace(secondmessage,"Selamat Datang");
			System.out.print("\nNew statement in String 1 : " + replace);
		}
		else
			System.out.print("Second String Not Exist in First String");
			
			
		     			
	}

}
