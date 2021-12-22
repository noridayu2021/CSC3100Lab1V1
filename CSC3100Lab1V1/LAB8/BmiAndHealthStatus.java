import java.util.Scanner;
public class BmiAndHealthStatus {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		
		//double height;
		//double weight;
		//double waistsize;
		//int gender;
		//double bmi;
		char status;
		
		System.out.println("THIS IS SIUU HEALTH CHECK CORNER");
		System.out.println("BMI Information");
		System.out.println("BMI (18.5-24.9) Normal");
		System.out.println("BMI (25-29.9) Over Weight");
		System.out.println("BMI (30-34.9) Obese");
		System.out.println("BMI (35-39.9) Severely Obese");
		System.out.println("BMI (>=40) Morbidly Obese\n");
		System.out.println("*************");
		System.out.println("\nCAUTION!!!!!!");
		System.out.println("Women – waist size > 35 inches");
		System.out.println("Men – waist size > 40 inches  ");
		System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------\n");
		System.out.println("*************\n");

		
		
		do {
		
			
		System.out.print("Enter your name: " );
		String name=input.nextLine();
		
		System.out.print("Enter your gender(1 if Male OR 0 if Female): ");
		int gender = input.nextInt();
		
		System.out.print("Enter your height in meters: ");
		double height=input.nextDouble();
		
		System.out.print("Enter your weight in kilogram: " );
		double weight=input.nextDouble();
		 
		System.out.print("Enter your waist size in inches: ");
		double waistsize=input.nextDouble();
		
		double bmi = weight/(height*height);//calculation
		System.out.println( "\n" + name + " your BMI is " + String.format("%.2f",bmi) ); // print 2 decimal points only
				
				
		
		//BMI
	
					if(bmi>=18.5 && bmi<=24.9) {
						System.out.println("You have normal BMI ");
					}
						else if(bmi>=25 && bmi<=29.9) {
							System.out.println("You are overweight ");
						}
						else if (bmi>=30 && bmi<=34.9) {
							System.out.println("You are obese ");
						}
						else if(bmi>=35 && bmi<=39.9) {
							System.out.println("You are severely obese ");
						}
						else if(bmi>=40) {
							System.out.println("You are morbidly obese  ");
						}
				
				if(gender==1) {
					if(waistsize>40)
					System.out.println("and you have higher risk for heart disease and type 2 diabetes");
				
					else 
					System.out.println("and you are normal and have a good lifestyle..CONGRATS..SIUUU!!");
				}
				
				else if (gender==0) {
					if(waistsize>35)
					System.out.println(" and you have higher risk for heart disease and type 2 diabetes");
					 else 
					System.out.println("and you are normal and having a good lifestyle..CONGRATS..SIUUU!");
				}
					
				
							System.out.println("Continue with the next person???????????");
							System.out.println("Enter Y||y if Yes");
							System.out.println("Enter N||n if No");
							status=input.next().charAt(0);
							input.nextLine();
				
						}
						while(status!='N'&& status!='n');{
							System.out.println("Thank You for using the system and stay healthy...SIUUUU");
							
						}
						
		
		
						
				
				
							
						
							
				
	}
		
		
		
					
			
	}
