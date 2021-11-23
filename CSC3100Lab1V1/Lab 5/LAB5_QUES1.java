//NAME:DANESHWAREN RAGUPATHY
//MATRIKS NUMBER: 209858
//LAB ASSIGNMENT 2

import java.util.Scanner; //import a class
public class LAB5_QUES1 {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in); //create a scanner class
		System.out.println("WELCOME TO THE LAND OF SUNWAY !!!");
		
		//request input
		System.out.print("Please enter your Age : ");
		int age=input.nextInt();
		System.out.println("**************************");
		System.out.println("* ENTER 0 FOR THEME PARK *");
		System.out.println("* ENTER 1 FOR WATER PARK *");
		System.out.println("* ENTER 2 FOR BOTH PARK  *");
		System.out.println("**************************");
		System.out.print("Please enter which park type you prefer : ");
		int parktype=input.nextInt();
		int totalprice=0; 
		
		//conditions
		if(age>=55) {
			if(parktype==0) {
				totalprice=10;	
			}else if(parktype==1) {
				totalprice=15;
			}else if(parktype==2) {
				totalprice=20;
			}else System.out.println("Please enter a valid park type!!");
		}
		else if(age>=21 && age <=54) {
			if(parktype==0) {
				totalprice=25;	
			}else if(parktype==1) {
				totalprice=30;
			}else if(parktype==2) {
				totalprice=45;
			}else System.out.println("Please enter a valid park type!!");
		}
		else if(age>=13 && age<=20) {
			if(parktype==0) {
				totalprice=20;	
			}else if(parktype==1) {
				totalprice=25;
			}else if(parktype==2) {
				totalprice=40;
			}else System.out.println("Please enter a valid park type!!");
		}
		else if(age<=12 && age>=3) {
			if(parktype==0) {
				totalprice=10;	
			}else if(parktype==1) {
				totalprice=15;
			}else if(parktype==2) {
				totalprice=20;
			}else System.out.println("Please enter a valid park type!!");
		}
		else if(age<3 && age>=0) {
			if(parktype==0) {
				totalprice=0;	
			}else if(parktype==1) {
				totalprice=7;
			}else if(parktype==2) {
				totalprice=5;
			}else System.out.println("Please enter a valid park type!!");
		}
		else {
			//outputs
			System.out.println("Please enter a valid age !!");
		}
		//System.out.println("\nThe Grand Total needed to pay is : RM "+ totalprice);
		
		
	}

}
